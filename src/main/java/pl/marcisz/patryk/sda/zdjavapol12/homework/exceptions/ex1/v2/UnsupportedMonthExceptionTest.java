package pl.marcisz.patryk.sda.zdjavapol12.homework.exceptions.ex1.v2;

public class UnsupportedMonthExceptionTest {
    public static void main(String[] args) {
        for(int i=1; i<20; i++){
            try {
                Month month = Month.ofNumber(i);
                System.out.println(month);
            } catch (UnsupportedMonthException e) {
                System.out.println("problem podczas tworzenia miesiaca " + e.getInvalidMonth());
                System.out.println(e.getMessage());
            }
        }
    }
}
