package exam01;

public class student {
    static int id;// 객체랑 관계없이 공유됨
    String name;
    String major;
    public student(){    }//생성자 오버로드, 생성자가 없을 때 생성되는 기본 생성자 ]
    // 밑에 생성자를 정의해서 기본 생성되지 않아, 명시적으로 정의
    public student(int id,String name,String major){
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public static void staticMessage() {
    }

    void study() {
        System.out.printf("id:%d, name:%s, major:%s%n",id,name,major);
    }
    final int NUM = 1000;
}