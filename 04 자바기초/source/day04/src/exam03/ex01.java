package exam03;

public class ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
        System.out.println(cal.num);
        cal.commonMethod();
    }
}
