package pl.marcisz.patryk.sda.zdjavapol12.homework.generics;

public class GenericChefRunner {
    public static void main(String[] args) {
        Chef<Nudle> nudleChef = new Chef<>();
        Chef<Cabbage> cabbageChef = new Chef<>();
        Chef<Beef> beefChef = new Chef<>();
        Chef<Food> topChef = new Chef<>();

        Food someFood = new Nudle();
        Nudle nudle = new Nudle();
        Cabbage cabbage = new Cabbage();
        Beef beef = new Beef();

        //nudleChef.prepareMeal(someFood); //nie działa, bo metoda spodziewa się obiektu Nudle, Food może ale nie musi być Noodle
        nudleChef.prepareMeal(nudle); //tu jest spoko, dostajemy to czego oczekiwaliśmy
        //nudleChef.prepareMeal(cabbage); //jw. spodziewa się Nudle, a nie Cabbage
        //nudleChef.prepareMeal(beef); //same here, blad

        //cabbageChef.prepareMeal(someFood); //jak w przypadku nudleChef z someFood
        //cabbageChef.prepareMeal(nudle);
        cabbageChef.prepareMeal(cabbage); //ok, to umie przyrzadzic
        //cabbageChef.prepareMeal(beef); //no tak srednio

        //to samo bedzie z beefChef
        //beefChef.prepareMeal(someFood); //nie
        //beefChef.prepareMeal(nudle);    //nie
        //beefChef.prepareMeal(cabbage);  //nie
        beefChef.prepareMeal(beef);     //tak!

        //i na koncu TopChef, ten to umie wszystko, ale tylko na poziomie metod zawartych w klasie Food
        topChef.prepareMeal(someFood);
        topChef.prepareMeal(nudle);
        topChef.prepareMeal(cabbage);
        topChef.prepareMeal(beef);
    }
}

abstract class Food {

    protected final String name;

    public Food(String name) {
        this.name = name;
    }

    public abstract void prepare();

}

class Nudle extends Food {

    public Nudle() {
        super("nudle");
    }

    @Override
    public void prepare() {
        System.out.println(name);
    }
}

class Cabbage extends Food {

    public Cabbage() {
        super("cabbage");
    }

    @Override
    public void prepare() {
        System.out.println(name);
    }
}

class Beef extends Food{

    public Beef() {
        super("beef");
    }

    @Override
    public void prepare() {
        System.out.println(name);
    }
}

class Chef <T extends Food> {

    void prepareMeal(T foodToPrepare){
        foodToPrepare.prepare();
    }

}


