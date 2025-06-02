package exam01;

public class ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;//ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            //System.out.println("예외처리");
            String message = e.getMessage();
            System.out.printf("message: '%s'%n",message);
            e.printStackTrace();
        }
    }
}
