package pl.marcisz.patryk.sda.zdjavapol12.exceptions;

public enum Month {

    JANUARY,
    FEBRUARY,
    MARCH;

    public static void showMonthByNumber(int number) {
        try {
            System.out.println(Month.values()[number-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Month ofNumber(int number) {
        try {
            return Month.values()[number-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new UnsupportedMonthException(number);
        }
    }

    public static void main(String[] args) {
        showMonthByNumber(1);
        showMonthByNumber(15);
        Month january = ofNumber(1);
        System.out.println(january);
        try {
            Month exception = ofNumber(20);
        } catch(UnsupportedMonthException e){
            System.out.println("przecież to nie miesiac ? " + e.getMessage());
        }

    }

}
