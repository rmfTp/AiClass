package exam02;

public class ex03 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("ABC");
        checkEqual(s1,s2);
    }
    static void checkEqual(String s1, String s2){
        //System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
