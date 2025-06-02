package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex09 {
    public static void main(String[] args) {
        int[] nums = IntStream.iterate(1,i->i+2).limit(10).toArray();
        System.out.println(Arrays.toString(nums));
        int[] nums1 = IntStream.generate(()->1).limit(10).distinct().toArray();
        System.out.println(Arrays.toString(nums1));
    }
}
