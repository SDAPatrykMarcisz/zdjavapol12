package pl.marcisz.patryk.sda.zdjavapol12.homework.exceptions.ex1.v1;

public class UnsupportedMonthExceptionTest {
    public static void main(String[] args) {
        for(int i=1; i<20; i++){
            if(Month.isMonthNumberSupported(i)) {
                Month month = Month.ofNumber(i);
                System.out.println(month);
            }
        }
    }
}
