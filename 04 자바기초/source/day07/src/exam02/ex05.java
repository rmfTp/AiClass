package exam02;

public class ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(500);
        System.out.printf("sb 주소:%d%n", System.identityHashCode(sb));
        sb.append("ABC");;
        System.out.printf("sb 주소:%d%n", System.identityHashCode(sb));
        sb.append("DEF");;
        System.out.printf("sb 주소:%d%n", System.identityHashCode(sb));
        sb.append("GHI");;
        System.out.printf("sb 주소:%d%n", System.identityHashCode(sb));
        String str1 = sb.toString();
        System.out.println(str1);
        System.out.printf("str1 주소:%d%n", System.identityHashCode(str1));
        System.out.println(str1 == "ABCDEFGHI");
    }
}
