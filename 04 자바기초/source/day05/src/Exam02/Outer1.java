package Exam02;

public class Outer1 {
    private static int num1 = 150;
    private static int num2 = 200;
    class Inner{//내부 클래스
        private static int num1 = 100;
        public void method() {
            System.out.println("인스턴스");
            System.out.printf("Inner.num1: %d%n",num1);
            System.out.printf("Inner.num2: %d%n",num2);
            System.out.printf("Outer1.num1: %d%n",Outer1.this.num1);
        }
    }
}
