package Exam02;

public class Outer2 {
    private int num1 = 10;
    private static int num2 = 200;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    static class Inner{//내부 클래스
        public void method() {
            System.out.println("정적");

        }
    }
}
