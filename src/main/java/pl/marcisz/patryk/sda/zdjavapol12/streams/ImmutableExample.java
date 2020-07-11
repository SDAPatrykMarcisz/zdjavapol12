package pl.marcisz.patryk.sda.zdjavapol12.streams;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {
    private final List<String> stringList;

    public ImmutableExample(List<String> stringList) {
        this.stringList = new ArrayList<>(stringList);
    }

    public String getByIndex(int x){
        return stringList.get(x);
    }

}
