package exam02;

public class ex05 {
    public static void main(String[] args){
        int[] numbs = {10,20,30,40,50,60};
        System.out.printf("nums.length:%d%n", numbs.length);
        //for (int i = 0; i <= numbs.length - 1; i++) System.out.printf("nums[%d]:%d%n", i, numbs[i]);
        for (int i = 0; i < numbs.length; i++) {
            System.out.printf("nums[%d]:%d%n", i, numbs[i]);
        }
    }
}
