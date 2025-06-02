package exam01;

import java.lang.reflect.Method;

public class ex05 {
    public static void main(String[] args) {
        student s1 = new student();
        student.id = 1000;
        System.out.println(student.id);

        Class cls = student.class;
        Method[] methods = cls.getDeclaredMethods();

        for(Method method: methods){
            System.out.println(method);
        }
    }
    static void staticMessage() {
        System.out.println("staticMessage!");
    }
}
