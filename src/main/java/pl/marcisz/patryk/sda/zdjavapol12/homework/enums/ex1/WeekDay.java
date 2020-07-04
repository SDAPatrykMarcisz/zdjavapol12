package pl.marcisz.patryk.sda.zdjavapol12.homework.enums.ex1;

public enum WeekDay {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekday(){
        return this != WeekDay.SATURDAY && this != WeekDay.SUNDAY;
    }

    boolean isHoliday(){
        return !isWeekday();
    }
}
