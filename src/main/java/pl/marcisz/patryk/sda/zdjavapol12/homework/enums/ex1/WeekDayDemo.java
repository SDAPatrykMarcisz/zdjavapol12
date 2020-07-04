package pl.marcisz.patryk.sda.zdjavapol12.homework.enums.ex1;

public class WeekDayDemo {
    public static void main(String[] args) {
        for(WeekDay day : WeekDay.values()){
            System.out.println("Today is " + day);
            testDay(day);
            isGreaterThanSaturday(day);
            System.out.println("-------");
        }
    }

    private static void testDay(WeekDay day) {
        if(day.isWeekday()){
            System.out.println("Go to Work");
        } else {
            System.out.println("Today time for rest");
        }
    }

    private static void isGreaterThanSaturday(WeekDay day){
        WeekDay saturday = WeekDay.SATURDAY;
        int result = day.compareTo(saturday);
        System.out.print( "(" + result + ") Is greater than saturday ? ");
        if (result < 0) {
            System.out.println("No, it isn't");

        } else if (result == 0) {
            System.out.println("is equal");

        } else {
            System.out.println("yeah, greater, it's sunday!");
        }
    }
}
