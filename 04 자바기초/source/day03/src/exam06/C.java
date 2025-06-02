package exam06;

public class C extends B{
    int numC = 30;
    public C(){
        super();//상속을 하면 기본 추가됨(보이진 않음)
        //상위 클래스 주소값을 주는 지역변수 ==B();
        System.out.println("C() 생성자");
    }
}
