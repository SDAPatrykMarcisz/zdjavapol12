package pl.marcisz.patryk.sda.zdjavapol12.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsExampleTest {

    @Test
    void shouldReturnListWithoutDuplicates(){
        //given
        List<String> input = new ArrayList<>();
        input.add("aa");
        input.add("aa");
        input.add("aa");
        input.add("bb");
        input.add("cc");

        //when
        List<String> output = CollectionsExample.removeDuplicates(input);

        //then
        assertEquals(3, output.size());
        assertEquals("aa", output.get(0));
        assertEquals("bb", output.get(1));
        assertEquals("cc", output.get(2));
    }

}