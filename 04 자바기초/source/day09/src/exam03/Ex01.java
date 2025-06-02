package exam03;

public class Ex01 {
    public static void main(String[] args) {
//        Calculator cal = new Calculator(){
//            public int add(int num1, int num2) {
//                return num1 + num2;
//            }
//        };// new Calculator(){} -> 앞에서 이미 정의됨 public int , return -> 인터페이스에 명시됨
        //add -> 시그니처로 알 수 있음
        Calculator cal = (a,b) -> a + b;
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
