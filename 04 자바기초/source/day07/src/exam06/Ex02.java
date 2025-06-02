package exam06;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> fruits = List.of("사과","오렌지","멜론","망고");
        Collections.sort(fruits, Comparator.reverseOrder());
        System.out.println(fruits);
    }
}
