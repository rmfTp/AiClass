package exam01;

public class ex04 {
    public static void main(String[] args) {
        student s1 = new student(1000,"이이름","컴퓨터공학");
        student s2 = new student(1001,"김이름","컴퓨터공학");
        s1.study();
        s2.study();
        s1.id = 1000;
        student.staticMessage();
        System.out.println(s1.NUM);
    }
}
