package exam01;

public class ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;//ArithmeticException
            System.out.println(result);
            String str = null;
            str = str.toUpperCase();
            System.out.println(str);
        } catch (ArithmeticException | NullPointerException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
