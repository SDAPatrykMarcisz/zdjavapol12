package pl.marcisz.patryk.sda.zdjavapol12.generics;

public class Containers {

    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<String, Integer>("Dzien", 4);

        FiveElements<String, Integer, Character, Boolean, Double> fiveElements = new FiveElements<>("a", 2, 'c', true, 30.0);
        System.out.println(fiveElements.getThird());

        Pair<Pair<String, Integer>, Triple<Character, Boolean, Double>> fiveElementByPair = new Pair<>(new Pair<>("a", 2), null /*new Triple<>('c', true, 30.0)*/);
        System.out.println(fiveElementByPair.getSecond().getFirst());
    }

}

class Pair<T,R> {

    private final T first;
    private final R second;

    public Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }
}

class Triple<T,R,S>{
    private final T first;
    private final R second;
    private final S third;

    public Triple(T first, R second, S third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }

    public S getThird() {
        return third;
    }
}

class FiveElements <FIRST_TYPE, SECOND_TYPE, THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE>{

    private Pair<FIRST_TYPE, SECOND_TYPE> pair;
    private Triple<THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> triple;

    public FiveElements(FIRST_TYPE a, SECOND_TYPE b, THIRD_TYPE c, FOURTH_TYPE d, FIFTH_TYPE e) {
        this.pair = new Pair<>(a,b);
        this.triple = new Triple<>(c,d,e);
    }

    public FIRST_TYPE getFirst(){
        return pair.getFirst();
    }

    public SECOND_TYPE getSecond(){
        return pair.getSecond();
    }

    public THIRD_TYPE getThird(){
        return triple.getFirst();
    }

    public FOURTH_TYPE getFourth(){
        return triple.getSecond();
    }

    public FIFTH_TYPE getFifth(){
        return triple.getThird();
    }


}
