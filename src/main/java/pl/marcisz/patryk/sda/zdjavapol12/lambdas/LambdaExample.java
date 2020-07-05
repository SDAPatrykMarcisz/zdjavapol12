package pl.marcisz.patryk.sda.zdjavapol12.lambdas;

import java.util.function.BiFunction;

public class LambdaExample {
    public static void main(String[] args) {
        lambdaPlays();
    }

    @FunctionalInterface
    interface MathOperation<TYPE> {
        TYPE calculate(TYPE a, TYPE b);
    }

    private static void calculator(MathOperation<Double> o, Double a, Double b) {
        System.out.println(o.calculate(a, b));
    }

    public static void lambdaPlays() {
        BiFunction<Long, Long, Long> add = (x, y) -> x + y;

        BiFunction<Long, Long, Long> addAsAnonimous = new BiFunction<Long, Long, Long>() {
            @Override
            public Long apply(Long aLong, Long aLong2) {
                return aLong + aLong2;
            }
        };

        BiFunction<Long, Long, Long> addAsAnonimous2 = (Long x, Long y) -> x + y;

        MathOperation<Double> adding = (a, b) -> a + b;
        MathOperation<Double> substracting = (Double a, Double b) -> {
            return a - b;
        };
        MathOperation<Double> multiplying = (Double a, Double b) -> a * b;
        MathOperation<Double> dividing = (a, b) -> {
            return a / b;
        };

        calculator(adding, 10d, 15d);


    }


}
