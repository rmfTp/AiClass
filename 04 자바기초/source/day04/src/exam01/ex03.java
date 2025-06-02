package exam01;

public class ex03 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();
        if (ad instanceof C) {// ad가 C 유래인지 확인 후
            C c1 = (C) ad;//강제 형 변환(다운캐스팅)
        }
        if (ac instanceof C c2) {// ac가 C 유래인지 확인 후 c2생성
            System.out.println(c2.numC);
        }
    }
}
