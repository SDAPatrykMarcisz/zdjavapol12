package pl.marcisz.patryk.sda.zdjavapol12.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercises {

    public static void main(String[] args) {
        ex6();
    }

    private static void ex1() {
        Stream<String> stream = Stream.of("First", "Second", "third", "fourth", "fifth");

        Set<String> collect = stream
                .filter(element -> element.length() > 5)
                .map(String::toUpperCase)
                //                .map(element -> element.toUpperCase())
                .collect(Collectors.toSet());

        collect.forEach(x -> System.out.println(x));
    }

    private static void ex1v2() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        Stream<String> stream = list.stream();

        Set<String> collect = stream.filter(element -> element.length() > 5)
                .map(String::toUpperCase)
//                .map(element -> element.toUpperCase())
                .collect(Collectors.toSet());

        for (String s : collect) {
            System.out.println(s);
        }
    }

    private static void ex2() {
        Optional<String> first = Arrays.asList("first", "second", "third", "fourth", "fifth").stream()
                .filter(x -> x.length() >= 7)
                .findFirst();

        System.out.println(first);

        String element = first.orElseThrow(() -> new RuntimeException("element not found"));
        System.out.println(element);
    }

    private static void ex4() {
        OptionalInt max = IntStream.of(1, 26, 30, 2, 45)
                .max();

        OptionalInt max1 = Stream.of(1, 26, 30, 2, 45).mapToInt(x -> x)
                .max();

        Optional<Integer> max2 = Stream.of(1, 26, 30, 2, 45).max(Comparator.naturalOrder());

        Integer max3 = Stream.of(1, 26, 30, 2, 45).sorted(Comparator.reverseOrder()).findFirst().get();

        Integer max4 = Stream.of(1, 26, 30, 2, 45)
                .reduce(Integer.MIN_VALUE, (acc, curr) -> curr > acc ? curr : acc);

        Integer max5 = Stream.of(1, 26, 30, 2, 45)
                .reduce(Integer.MIN_VALUE, (acc, curr) -> Math.max(acc, curr));

        Integer max6 = Collections.max(Arrays.asList(1, 26, 30, 2, 45));

        System.out.println(max);
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);
        System.out.println(max5);
        System.out.println(max6);

        max2.orElseThrow(() -> new RuntimeException());
        max2.orElse(Integer.MIN_VALUE);
        max2.orElseGet(() -> 2);
        max2.ifPresentOrElse(
                x -> System.out.println(x),
                () -> {
                    throw new RuntimeException();
                }
        );


    }

    private static void ex5() {
        Set<String> collect = Stream.of(1, 26, 30, 2, 45)
                .filter(element -> element > 26)
                .map(String::valueOf)
                .collect(Collectors.toSet());

    }

    private static void ex6() {
        Double averageOfDoubles = Optional.of(
                Stream.of(10.0, 20.0, 30.0, 40.0)
                        .map(element -> Map.of(element, 1d).entrySet().stream().findFirst().get()) /* mapuje kazdy element streamu na obiekt Map.Entry */
                        /* metoda Map.of tworzy mapę na podstawie parametrów typu pierwszy parametr klucz, drugi parametr wartosc, trzeci parametr klucz drugiej pary itd.*/
                        .reduce(Map.of(0d, 0d).entrySet().stream().findFirst().get(),  /* accumulator, key to suma, wartosc to licznik */
                                (acc, curr) -> Map.of(acc.getKey() + curr.getKey(), acc.getValue() + 1).entrySet().stream().findFirst().get()))
                .map(entry -> entry.getKey() / entry.getValue()) /*mapowanie suma / licznik, ten .map należy do obiektu optional, nie do streamu */
                .orElse(Double.NaN);

        System.out.println(averageOfDoubles);
    }

}


