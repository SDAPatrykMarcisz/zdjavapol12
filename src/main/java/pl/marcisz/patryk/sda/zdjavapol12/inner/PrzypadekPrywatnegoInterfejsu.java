package pl.marcisz.patryk.sda.zdjavapol12.inner;

import java.util.function.BiFunction;

public class PrzypadekPrywatnegoInterfejsu {

    private interface TajemnicaOKtorejWszyscyWiedza {
        public default void tajemnica() {
            System.out.println(tajemnicaPoliszynela());
        }

        private String tajemnicaPoliszynela() {
            return "tajemnicaPoliszynela";
        }

    }

    class ZaufanyCzlowiek implements TajemnicaOKtorejWszyscyWiedza {

    }

    public static void main(String[] args) {
//        new PrzypadekPrywatnegoInterfejsu().new ZaufanyCzlowiek().tajemnica();
    }

    public void isItFinal() {
        int one = 20;
        int two = one;
        two++;
        int three;
        if (one == 4) {
            three = 3;
        } else {
            three = 4;
        }
        int four = 4;
        class Inner {
            public void print() {
                System.out.println(one);
//                System.out.println(two);
                System.out.println(three);
//                System.out.println(four);
            }
        }
        four = 5;
    }



}
