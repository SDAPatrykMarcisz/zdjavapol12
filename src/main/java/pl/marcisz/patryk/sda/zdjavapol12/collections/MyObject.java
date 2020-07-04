package pl.marcisz.patryk.sda.zdjavapol12.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyObject {

    private final String anyString;
    private final int anyInt;

    public MyObject(String anyString, int anyInt) {
        this.anyString = anyString;
        this.anyInt = anyInt;
    }

    public String getAnyString() {
        return anyString;
    }

    public int getAnyInt() {
        return anyInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return anyInt == myObject.anyInt &&
                Objects.equals(anyString, myObject.anyString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anyString, anyInt);
    }

    public static List<MyObject> removeDuplicates(List<MyObject> list){
        List<MyObject> toReturn = new ArrayList<>();
        for(MyObject s : list){
            if(!toReturn.contains(s)){
                toReturn.add(s);
            }
        }
        return toReturn;
    }

}
