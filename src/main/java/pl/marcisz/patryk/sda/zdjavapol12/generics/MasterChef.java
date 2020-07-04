package pl.marcisz.patryk.sda.zdjavapol12.generics;

public class MasterChef {
    public static void main(String[] args) {
        Chef<Nudle> nudleChef = new Chef<>();
        Nudle polishNudle = new Nudle();
        Cabbage cabbage = new Cabbage();

        Food anyNudle = polishNudle;

        nudleChef.prepareMeal(polishNudle);
//        nudleChef.prepareMeal(cabbage);

        if(anyNudle instanceof Nudle){
            nudleChef.prepareMeal((Nudle)anyNudle);
        }

        Chef<Food> masterChef = new Chef<>();
        masterChef.prepareMeal(polishNudle);
        masterChef.prepareMeal(cabbage);
        masterChef.prepareMeal(anyNudle);
    }
}

abstract class Food{

    protected final String name;

    protected Food(String name) {
        this.name = name;
    }

    abstract void prepare();
}

class Nudle extends Food{

    protected Nudle() {
        super("nuddle");
    }

    @Override
    void prepare() {

    }
}

class Cabbage extends Food{

    protected Cabbage() {
        super("cabbage");
    }

    @Override
    void prepare() {

    }
}

class Chef<T extends Food>{
    public void prepareMeal(T mealToDo){
        mealToDo.prepare();
    }
}

