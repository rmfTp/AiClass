package exam03;

import exam01.A;

public class Ex05 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void methodA() {
                System.out.println("methodA 재정의");
            }

            @Override
            public void method() {
                return;
            }
        };
    }
}
