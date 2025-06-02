package exam02;

public class ex07 {
    public static void main(String[] args) {
        int result1 = sum(10,20,30,40);
        int result2 = sum(10,20);
        System.out.println(result1);
        System.out.println(result2);
    }
    static int sum(int... nums){
        int total = 0;
        for (int num : nums){
            total += num;
        }
        return total;
    }
}
