package exam02;

public class ex02 {
    public static void main(String[] args) {
        String  str1 = "ABC";
        String  str2 = "ABC";
        String  str3 = new String("ABC");
        System.out.printf("str1 == str2:%s, str1.equals(str2):%s%n", str1 == str2, str1.equals(str2));
        System.out.printf("str1 주소:%d%n", System.identityHashCode(str1));
        System.out.printf("str2 주소:%d%n", System.identityHashCode(str2));
    }
}
