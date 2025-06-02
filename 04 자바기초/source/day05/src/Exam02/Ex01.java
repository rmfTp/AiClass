package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        Outer1 out = new Outer1(); //외부 클래스를 객체로 만들어야 내부 클래스 접근 가능
        Outer1.Inner in = out.new Inner();

        in.method();
    }
}
