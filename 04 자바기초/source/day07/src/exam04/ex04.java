package exam04;


public class ex04 {
    public static void main(String[] args) {
        Transportation taxi = Transportation.TAXI;
        System.out.println(taxi.name());//최종값
        System.out.println(taxi.toString());//변동가능
        System.out.println(taxi.ordinal());
    }
}
