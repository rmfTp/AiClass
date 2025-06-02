package exam01;

import java.util.List;
import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> scores = List.of(90,88,100,60,55,78);
        IntStream stm = scores.stream().mapToInt(s->s);
        double avg = stm.average().getAsDouble();
        System.out.println(avg);
    }
}
