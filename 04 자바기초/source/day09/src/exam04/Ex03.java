package exam04;

import java.util.function.IntBinaryOperator;

public class Ex03 {
    public static void main(String[] args) {
        IntBinaryOperator add = (a, b) -> a + b;
        int result = add.applyAsInt(10, 20);
        System.out.println(result);
    }
}