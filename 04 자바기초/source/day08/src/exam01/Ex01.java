package exam01;

@MyAnno(min = 10, max = {10,200})
public class Ex01 {
    @MyAnno(min = 1, max = 10, value = "안녕")
    public Ex01(){

    }
    @MyAnno("안녕2")
    void method(){

    }
}
