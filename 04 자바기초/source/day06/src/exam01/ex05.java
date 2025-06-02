package exam01;

public class ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            int result = num1 / num2;//ArithmeticException
            System.out.println(result);
            String str = null;
            str = str.toUpperCase();
            System.out.println(str);
        } catch (RuntimeException e){
            String message = e.getMessage();
            System.out.println(message);
            if (e instanceof NullPointerException){
                System.out.println("Null");
            }
        }
    }
}
