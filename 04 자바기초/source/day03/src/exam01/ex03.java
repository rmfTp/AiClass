package exam01;

public class ex03 {
    public static void main(String[] args) {
        student s1 = new student(1000,"이이름","컴퓨터공학");
        s1.study();
        student s2 = new student(1001,"김이름","컴퓨터공학");
        s2.study();
        System.out.println(s1==s2);
    }
}
