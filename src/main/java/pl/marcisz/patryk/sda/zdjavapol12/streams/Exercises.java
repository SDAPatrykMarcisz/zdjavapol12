package pl.marcisz.patryk.sda.zdjavapol12.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {

    public static void main(String[] args) {
        ex1();
    }

    private static void ex1(){
        Stream<String> stream = Stream.of("First", "Second", "third", "fourth", "fifth");

        Set<String> collect = stream
                .filter(element -> element.length() > 5)
                .map(String::toUpperCase)
//                .map(element -> element.toUpperCase())
                .collect(Collectors.toSet());

        collect.forEach(x -> System.out.println(x));
    }

    private static void ex1v2(){
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

        for(String s : collect){
            System.out.println(s);
        }
    }

}
