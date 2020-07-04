package pl.marcisz.patryk.sda.zdjavapol12.collections;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        Map<Long, String> personMap = new HashMap<>();
        personMap.put(1L, "Anna");
        personMap.put(2L, "Andrzej");
        personMap.put(3L, "Kamil");
        personMap.put(4L, "Kamil");

        System.out.println(personMap.get(2L));

        for (String s : personMap.values()) {
            if (s.startsWith("A")) {
                System.out.println(s);
            }
        }

        for (Long l : personMap.keySet()) {
            System.out.println(l);
        }


        for (Map.Entry<Long, String> mapEntry : personMap.entrySet()) {
            if (mapEntry.getValue().equals("Kamil")) {
                System.out.println(mapEntry.getKey());
            }
        }
    }
}
