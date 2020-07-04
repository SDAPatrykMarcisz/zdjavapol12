package pl.marcisz.patryk.sda.zdjavapol12.collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
//        example();
        System.out.println(oddRandomNumbers());

    }

    public static List<String> removeDuplicates(List<String> list){
        List<String> toReturn = new ArrayList<>();
        for(String s : list){
            if(!toReturn.contains(s)){
                toReturn.add(s);;
            }
        }
        return toReturn;
    }

    public static List<Integer> oddRandomNumbers() {
        List<Integer> oddNumbers = new ArrayList<>();
//        List<Integer> oddNumbers = new LinkedList<>();
//        List<Integer> oddNumbers = new Vector<>();
//        List<Integer> oddNumbers = new Stack<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            oddNumbers.add(random.nextInt(20));
        }
        System.out.println(oddNumbers);
        removeEvenNumbersBadSolution(oddNumbers);
        return oddNumbers;

    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {

        for(Iterator<Integer> it = numbers.iterator(); it.hasNext();){
            Integer element = it.next();
            if(element % 2 == 0){
                it.remove();
            }
        }

        return numbers;
    }

    public static List<Integer> removeEvenNumbersRemoveIf(List<Integer> numbers) {
        numbers.removeIf(element -> element % 2 == 0);
        return numbers;
    }

    public static List<Integer> removeEvenNumbersBadSolution(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            Integer integer = numbers.get(i);
            if(integer % 2 == 0){
                numbers.remove(integer);
                //i--; rozwiazanie ale "nieladne"
            }
        }
        return numbers;
    }

    public static List<Integer> removeEvenNumbersExceptionSolution(List<Integer> numbers) {

        for(int i: numbers){ //tak nie zadziala
            if(i%2 == 0){
                numbers.remove(i);
            }
        }

        return numbers;
    }

    private static void example() {
        Set<String> setExample = new HashSet<>();
        System.out.println(setExample.add("val")); //true
        System.out.println(setExample.add("val")); //false

        List<String> listExample = new ArrayList<>();
//        ArrayList<String> reference = new ArrayList<>();
        System.out.println(listExample.add("val")); //true
        System.out.println(listExample.add("val")); //true

        Queue<String> que = new ArrayDeque<>();
        System.out.println(que.add("val")); //true
        System.out.println(que.add("val")); //true

        List<String> list = new ArrayList<>();
        System.out.println(list.add("bow")); //true
        System.out.println(list.add("bow")); //true
        System.out.println(list); //[bow, bow]
        System.out.println(list.remove("sword")); //false
        System.out.println(list); //[bow, bow]
        System.out.println(list.remove("bow")); //true
        System.out.println(list); //[bow}
    }
}
