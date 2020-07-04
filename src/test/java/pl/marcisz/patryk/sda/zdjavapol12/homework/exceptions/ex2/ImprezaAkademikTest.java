package pl.marcisz.patryk.sda.zdjavapol12.homework.exceptions.ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class ImprezaAkademikTest {

    @Mock
    private Random randomMock;

    private ImprezaAkademik imprezaAkademik;

    @BeforeEach
    void setUp(){
        imprezaAkademik = new ImprezaAkademik(randomMock);
    }

    @Test
    void shouldThrowUnexpectedExceptionWhenRandomReturnValueBetween0And5(){
        //given
        int drunkLevel = 0;
        Mockito.when(randomMock.nextInt(30)).thenReturn(3);
        //when
        assertThrows(UnexpectedException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);
                });
    }

    @Test
    void shouldReturnEmptyResultsWhenRandomReturnValueBetween5And20() throws UnexpectedException, HangOverException {
        //given
        int drunkLevel = 0;
        Mockito.when(randomMock.nextInt(30)).thenReturn(20);
        imprezaAkademik.party(drunkLevel);
    }

    @Test
    void shouldReturnEmptyResultsWhenRandomReturnValueOver20AndDrunkLevelLowerThan10() throws UnexpectedException, HangOverException {
        //given
        int drunkLevel = 5;
        Mockito.when(randomMock.nextInt(30)).thenReturn(21);
        imprezaAkademik.party(drunkLevel);
    }

    @Test
    void shouldThrowMarsMissionExceptionWhenDrunkLevelOver50AndRandomReturnValueOver20() throws UnexpectedException, HangOverException {
        //given
        int drunkLevel = 55;
        Mockito.when(randomMock.nextInt(30)).thenReturn(21);
        //when
        assertThrows(MarsMissionException.class,
                () -> {
                    imprezaAkademik.party(drunkLevel);
                });
    }






}