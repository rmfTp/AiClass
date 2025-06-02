package exam04;


import static exam04.Transportation.BUS;

public class ex06 {
    public static void main(String[] args) {
        Transportation[] items = Transportation.values();//상수-> 목록 배열
        System.out.println(BUS.ordinal());
    }
}
