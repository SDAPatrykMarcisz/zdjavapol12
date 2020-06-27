package pl.marcisz.patryk.sda.zdjavapol12.exceptions;

public class UnsupportedMonthException extends RuntimeException {

    public UnsupportedMonthException(int number) {
        super("Error occured while parsing " + number + " to Month");
    }

}
