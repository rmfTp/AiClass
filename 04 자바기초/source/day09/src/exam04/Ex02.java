package exam04;

import java.util.function.BinaryOperator;

public class Ex02 {
    public static void main(String[] args) {
        //BiFunction<Integer,Integer,Integer> add = (a, b) -> a + b;
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(10,20);
        System.out.println(result);
    }
}
