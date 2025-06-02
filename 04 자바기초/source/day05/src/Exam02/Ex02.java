package Exam02;

public class Ex02 {
    public static void main(String[] args) {
        Outer2.Inner in  = new Outer2.Inner();//정적에서는 외부 자원 접근 불가
        in.method();

    }
}
