package pl.marcisz.patryk.sda.zdjavapol12.exceptions;

public class HumanExceptionExample {

    public static void main(String[] args) {
        Human human = new Human();
        try {
            human.swim();
        } catch(HumanCannotSwimException e){
            System.out.println("naucz się pływać człowieku");
            e.getHuman();
        } catch(CannotSwimException e){
            e.printStackTrace();
            System.out.println("no trudno");
        }
//        human.swim();
    }

}

class CannotSwimException extends Exception {}

class Human {
    boolean canSwim = false;
    public void swim() throws CannotSwimException {
        // nieumiejetnosc plywania w trakcie kiedy próbujemy pływac
        // moze byc niebezpieczną sytuacją wartą obsłużenia,
        // np potrzeba zawołania ratownika (͡•ʖ͡•)
        if(!canSwim){
            CannotSwimException cannotSwimException = new HumanCannotSwimException(this);
            throw cannotSwimException;
        }
    }
}

class HumanCannotSwimException extends CannotSwimException{
    private Human human;
    public HumanCannotSwimException(Human human){
        this.human = human;
    }

    public Human getHuman() {
        return human;
    }
}

