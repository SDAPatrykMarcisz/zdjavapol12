package pl.marcisz.patryk.sda.zdjavapol12.enums;

import static pl.marcisz.patryk.sda.zdjavapol12.enums.Season.SUMMER;

public class EnumsMain {

    public static void main(String[] args) {
        Season winter = Season.WINTER;
        Season summer = SUMMER;
        System.out.println(winter);
        System.out.println(winter.toString());
        System.out.println(summer);

        System.out.println("----");

        Season fromString = Season.valueOf("WINTER");
        Season[] seasons = Season.values();
        for(Season s : seasons){
            System.out.print(s);
            System.out.println(" " + s.getDaysCounterForYear(2020));
        }
        int winterNumber = Season.WINTER.ordinal();
        Season fromInt = Season.values()[winterNumber];

        int daysCounter = fromString.getDaysCounterForYear(2019);
        Season wiosna = Season.fromPolishTranslation("Wiosna");
        System.out.println(wiosna);

        int comparisonResult = winter.compareTo(summer);
        System.out.println(comparisonResult);
        //wynik == 0 -> obiekty sa sobie rowne
        //wynik < 0 -> obiekt porownywany jest wiekszy od obecnego
        //wynik > 0 -> obiekt porownywany jest mniejszy od obecnego

        EnumsMain.isGreaterThanSummer(fromInt);
        EnumsMain.isGreaterThanSummer(InnyEnum.VALUE1);

    }

    enum InnyEnum{
        VALUE1,
        VALUE2;
    }


    public static void isGreaterThanSummer(Enum day) {
        int a = day.compareTo(SUMMER);

        if (a == 0) {
            System.out.println("Its saturday");
        } else if (a < 0) {
            System.out.println("Its before Saturday");
        } else {
            System.out.println("Its after saturday");
        }

    }

}
