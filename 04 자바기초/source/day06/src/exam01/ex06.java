package exam01;

public class ex06 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            int result = num1 / num2;//ArithmeticException
            System.out.println(result);
            String str = null;
            str = str.toUpperCase();
            System.out.println(str);
        } catch (ArithmeticException e){
            String message = e.getMessage();
            System.out.println(message);
        } catch (Exception e){
            System.out.println("몰?루");
        }
    }
}
