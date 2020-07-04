package pl.marcisz.patryk.sda.zdjavapol12.collections;

import java.util.*;

public class MyObject implements Comparable<MyObject> {

    private final String anyString;
    private final int anyInt;
    private int secondInt;

    public MyObject(String anyString, int anyInt) {
        this.anyString = anyString;
        this.anyInt = anyInt;
    }

    public MyObject(String anyString, int anyInt, int secondInt) {
        this.anyString = anyString;
        this.anyInt = anyInt;
        this.secondInt = secondInt;
    }


    public String getAnyString() {
        return anyString;
    }

    public int getAnyInt() {
        return anyInt;
    }

    public int getSecondInt() {
        return secondInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return anyInt == myObject.anyInt &&
                secondInt == myObject.secondInt &&
                Objects.equals(anyString, myObject.anyString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anyString, anyInt, secondInt);
    }

    public static List<MyObject> removeDuplicates(List<MyObject> list){
//        List<MyObject> toReturn = new ArrayList<>();
//        for(MyObject s : list){
//            if(!toReturn.contains(s)){
//                toReturn.add(s);
//            }
//        }

        return new ArrayList<>(new HashSet(list));
    }

    @Override
    public int compareTo(MyObject myObject) {
        return Comparator
                .comparing(MyObject::getAnyString)
                .thenComparing(MyObject::getAnyInt)
                .thenComparing(MyObject::getSecondInt)
                .compare(this, myObject);
    }

    public static void testSets(){
        MyObject myObject = new MyObject("a", 1, 2);
        MyObject myObject2 = new MyObject("a", 1, 3);
        MyObject myObject3 = new MyObject("b", 2, 4);

        Set<MyObject> hashSet = new HashSet<>();

        Comparator<MyObject> myObjectComparator = Comparator.comparing(MyObject::getAnyString).thenComparing(MyObject::getAnyInt);
      //  Set<MyObject> treeSet = new TreeSet<>(myObjectComparator);

        Set<MyObject> treeSet = new TreeSet<>();

        hashSet.add(myObject);
        hashSet.add(myObject2);
        hashSet.add(myObject3);

        System.out.println(hashSet);

        treeSet.add(myObject);
        treeSet.add(myObject2);
        treeSet.add(myObject3);

        System.out.println(treeSet);
    }
}
