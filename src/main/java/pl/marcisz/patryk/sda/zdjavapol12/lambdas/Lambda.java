package pl.marcisz.patryk.sda.zdjavapol12.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Lambda {

    private static void calculate(BiFunction<Long, Long, Long> o, Long a, Long b) {
        System.out.println(o.apply(a, b));
    }

    public static void lambdaPlay() {

        BinaryOperator<Long> add = (a, b) -> a + b;
        BinaryOperator<Long> multiply = (a, b) -> a * b;
        BinaryOperator<Long> divide = (a, b) -> a / b;
        BinaryOperator<Long> subtract = (a, b) -> a - b;

        Long a = 10L;
        Long b = 5L;

        calculate(add, a,b);
        calculate(subtract, a,b);
        calculate(divide, a,b);
        calculate(multiply, a,b);

    }

    public static void main(String[] args) {
        lambdaPlay();
    }

}