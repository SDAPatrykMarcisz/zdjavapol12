package pl.marcisz.patryk.sda.zdjavapol12.homework.enums.ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOperationTest {

    @Test
    @DisplayName("should 'of' method return reversed String for Reverse enum")
    void shouldOfReturnRevertedStringForReverse(){
        //given
        String origin = "Abecadlo";
        String result = "oldacebA";
        StringOperation stringOperation = StringOperation.REVERSE;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(result, ofMethodResult);
        assertEquals("oldacebA", ofMethodResult);
    }

    @Test
    @DisplayName("should 'of' method return lower String for to_lower enum")
    void shouldOfReturnRevertedStringForToLower(){
        //given
        String origin = "Abecadlo";
        String result = "abecadlo";
        StringOperation stringOperation = StringOperation.TO_LOWER;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(result, ofMethodResult);
    }

    @Test
    @DisplayName("should 'of' method return upper String for to_upper enum")
    void shouldOfReturnUpperStringForToUper(){
        //given
        String origin = "Abecadlo";
        String result = "ABECADLO";
        StringOperation stringOperation = StringOperation.TO_UPPER;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(result, ofMethodResult);
    }

    @Test
    @DisplayName("should 'of' method return correct String for upper_first enum")
    void shouldOfReturnRevertedStringForUpperFirst(){
        //given
        String origin = "AbEcAdLo";
        String result = "Abecadlo";
        StringOperation stringOperation = StringOperation.UPPER_FIRST;

        //when
        String ofMethodResult = stringOperation.of(origin);

        //then
        assertEquals(result, ofMethodResult);
    }

}