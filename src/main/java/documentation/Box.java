package documentation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Box<S> {

    S[] ts;

    public Box(S first, S... objects) {
        this.ts = (S[]) Array.newInstance(first.getClass(), objects.length > 0 ? objects.length + 1 : 1);
        ts[0] = first;
        for (int i = 0; i < objects.length; i++) {
            ts[i + 1] = objects[i];
        }
        //rozwiazanie wykorzystujace mechanizm refleksji, uwaga ze strony kompilatora
    }

    public static <T> T ship(T input) {
        return input;
    }

    public static void main(String[] args) {
        method1(args);
        method2();
        method3();
        method4();
    }

    private static void method1(String[] args) {
        String stringBox = Box.<String>ship("package");
        String[] stringArrayBox = Box.<String[]>ship(args);

        String stringBox2 = Box.ship("package");
        String[] stringArayBox2 = Box.ship(args);
    }

    private static void method2() {
        Box<String> box = new Box<>("first", "second", "third", "fourth");
        box.printAll();
    }

    public void printAll() {
        for (S t : ts) {
            System.out.println(t);
        }
    }

    private static void method3() {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
        List<Integer> integers = new ArrayList<>();
        integers.add(40);
        printList(integers);
    }

    public static void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
        //list.add("pies"); tej operacji nie wykonamy, ogranicza nas wildcard ?
    }

    public static void printListOfObjects(List<Object> list) { //przypominam, referencja to "sposob patrzenia na obiekt"
        for (Object x : list) {
            System.out.println(x);
        }
    }

    private static void method4() {
        List<List<String>> listOfListOfStrings = new ArrayList<>();
        ArrayList<String> listInsideOfList = new ArrayList<>();
        listInsideOfList.add("first!");
        listOfListOfStrings.add(listInsideOfList);

        System.out.println(listOfListOfStrings.get(0).get(0)); //<-- "first!
    }
    
}
