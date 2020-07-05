package pl.marcisz.patryk.sda.zdjavapol12.streams;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex6 {

    public static void ex1() {
        createBookList().stream()
                .filter(authorOfBookAgePredicate(50))
                //.collect(Collectors.toList());
                .forEach(System.out::println);
    }

    public static void ex3() {
        createBookList().stream()
//                .filter(book -> book.getPrice() < 50 && book.getPages() > 300);
                .filter(book -> book.getPrice() < 50)
                .filter(book -> book.getPages() > 300)
                .forEach(System.out::println);
    }

    public static void ex4(BookType type1, BookType type2) {
        createBookList().stream()
//                .filter(book -> book.getType().contains(type1) || book.getType().contains(type2))

//                .filter(book -> {
//                    Set<BookType> type = book.getType();
//                    for(BookType bookType : type){
//                        if(bookType == type1 || bookType == type2){
//                            return true;
//                        }
//                    }
//                    return false;
//                })

                .filter(book -> book.getType().stream()
                        .anyMatch(bookType -> bookType == type1 || bookType == type2))
                .forEach(System.out::println);
    }

    public static void ex4() {
        createBookList().stream()
                .filter(book -> book.getTittle().split("\\s+").length > 1)
                .forEach(x -> System.out.println(x));
    }

    //[BookType][Book]

    //.map( Book -> Map<BookType, Book>)

    public static void exmap1() {
        List<String> results = createBookList().stream()
                .map(book -> new StringBuilder(book.getAuthor().getName())
                        .append(" ")
                        .append(book.getAuthor().getSurname())
                        .append(" ")
                        .append(book.getTittle())
                        .append(" ")
                        .append(book.getPrice())
                        .toString())
                .collect(Collectors.toList());

        for(String str : results){
            System.out.println(str);
        }
    }

    public static void exmap2() {

        Map<BookType, List<Book>> result = createBookList().stream()
                .map(book -> {
                    Map<BookType, List<Book>> bookByTypeMap = new HashMap<>();
                    for (BookType type : book.getType()) {
                        bookByTypeMap.put(type, Collections.singletonList(book));
                    }
                    return bookByTypeMap;
                })
                .reduce(
                        new HashMap<>(),
                        (fullMap, currentMap) -> mergeMaps(fullMap, currentMap));
    }

    private static Map<BookType, List<Book>> mergeMaps(Map<BookType, List<Book>> map1, Map<BookType, List<Book>> map2) {
        for (Map.Entry<BookType, List<Book>> mapEntry : map1.entrySet()) {
            BookType key = mapEntry.getKey();
            if (map2.containsKey(key)) {
                mapEntry.getValue().addAll(map2.get(key));
            }
        }
        return map1;
    }

    private static Predicate<Book> authorOfBookAgePredicate(int age) {
        LocalDate today = LocalDate.now();
        return book -> today.getYear() - book.getAuthor().getBirthOfYear() > age;
    }

    public static void sort1(){
        List<Book> sortedBooks = createBookList().stream()
                .sorted(Comparator.comparing(Book::getTittle))
                .collect(Collectors.toList());

        //warto sprwadzic czy jezeli porownujemy tylko po tytule, to czy usunie nam te ktore
        //sie "duplikuja"
    }


    public static List<Book> createBookList() {
        return new ArrayList<>();
    }

}

class Book {
    private Author author;
    private Set<BookType> type;
    private String tittle;
    private int pages;
    private int price;

    public Book(Author author, Set<BookType> type, String tittle, int price, int pages) {
        this.author = author;
        this.type = type;
        this.tittle = tittle;
        this.price = price;
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public Set<BookType> getType() {
        return type;
    }

    public String getTittle() {
        return tittle;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }
}

class Author {

    private String name;
    private String surname;
    private int birthOfYear;

    public Author(String name, String surname, int birthOfYear) {
        this.name = name;
        this.surname = surname;
        this.birthOfYear = birthOfYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }
}

enum BookType {
    ADVENTURE,
    THRILLER,
    SCIENCE,
    FANTASY
}