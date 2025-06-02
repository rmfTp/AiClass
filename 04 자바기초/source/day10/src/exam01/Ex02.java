package exam01;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        int[] scores = {90,88,100,60,55,78};
        IntStream stm = Arrays.stream(scores);
        IntSummaryStatistics stat = stm.summaryStatistics();
        long count = stat.getCount();
        long sum = stat.getSum();
        long max = stat.getMax();
        long min = stat.getMin();
        double avg = stat.getAverage();
        System.out.println(count + " " + sum + " " + max + " " + min + " " + avg);
    }
}
