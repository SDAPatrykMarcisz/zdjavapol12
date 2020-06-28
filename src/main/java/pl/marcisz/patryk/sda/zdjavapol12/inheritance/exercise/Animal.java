package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise;

public class Animal {
    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze();
        //Ssak ssak = zwierze; nie da sie bo zwierze nie jest ssakiem
        //Ssak ssak = (Ssak)zwierze; to samo, rzuca java.lang.ClassCastException:
        try {
            Ssak ssak = (Ssak)zwierze;
        } catch (ClassCastException e){
            System.out.println("no nie da sie tego rzutowac, sorry");
        }
    }
}

class Zwierze {

}

class Ssak extends Zwierze {
}

class Gad extends Zwierze {
}

