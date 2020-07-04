package pl.marcisz.patryk.sda.zdjavapol12.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyObjectTest {
    @Test
    void shouldReturnListWithoutDuplicates(){
        //given
        List<MyObject> input = new ArrayList<>();
        MyObject myA = new MyObject("a", 1);
        input.add(myA);
        input.add(new MyObject("b", 1));
        input.add(new MyObject("c", 1));
        input.add(myA);
        input.add(myA);

        assertEquals(5, input.size());

        //when
        List<MyObject> output = MyObject.removeDuplicates(input);

        //then
        assertEquals(3, output.size());

        assertEquals("a", output.get(0).getAnyString());
        assertEquals(1, output.get(0).getAnyInt());

        assertEquals("b", output.get(1).getAnyString());
        assertEquals(1, output.get(1).getAnyInt());

        assertEquals("c", output.get(2).getAnyString());
        assertEquals(1, output.get(2).getAnyInt());
    }

}