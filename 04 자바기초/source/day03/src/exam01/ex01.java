package exam01;

public class ex01 {
    public static void main(String[] args) {
        student s1 = new student(1000,"이이름","컴퓨터공학");
        s1.study();
        student s2 = new student();
        System.out.printf("s1주소 : %d%n", System.identityHashCode(s1));
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "컴퓨터공학";
        s2.study();
        System.out.printf("s1주소 : %d%n", System.identityHashCode(s2));

        System.out.printf("s1 == s2 : %s%n", s1==s2);
        student s3 = s2;
        s3.id = 1003;
        s3.name = "박이름";
        s3.major = "컴퓨터공학";
        System.out.printf("s2 == s3 : %s%n", s3==s2);
        s2.study();

        s1 = null;
        System.out.printf("s1주소 : %d%n", System.identityHashCode(s1));
        //s1.study();Exception in thread "main" java.lang.NullPointerException: Cannot invoke

        student s4 = new student();
        s4.study();
    }
}
