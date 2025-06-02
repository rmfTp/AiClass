package exam02;

public class ex10 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {10,20,30},
                {40,50,60}
        };
        System.out.println("nums.length : "+ nums.length);
        System.out.println("nums[0].length : "+ nums[0].length);
        for (int i = 0;i< nums.length;i++)
            for (int j = 0;j<nums[i].length;j++)
                System.out.printf("nums[%d][%d] : %d%n",i,j,nums[i][j]);
    }
}
