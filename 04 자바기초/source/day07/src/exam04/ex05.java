package exam04;


public class ex05 {
    public static void main(String[] args) {
        String trans = "BUS";
        Transportation BUS = Enum.valueOf(Transportation.class, trans);
        System.out.println(BUS.ordinal());
    }
}
