package exam04;


public class ex07 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        int baseFare = trans.getBaseFare();
        System.out.println(baseFare);
        int total = Transportation.BUS.getTotal(10);
    }
}
