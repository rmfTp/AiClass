package exam02;

public class ex06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(500);
        String str = sb.append("ABC").append("DEF").append("GHI").toString();
        StringBuffer sb1 = new StringBuffer(500);
        sb1.append(true).append(true).append(false).append(true);
        /*StringBuffer sb1 = sb.append("ABC");
        System.out.println(sb == sb1);
        StringBuffer sb2 = sb1.append("DEF");;
        System.out.println(sb2 == sb1);*/
        System.out.println(str);
        System.out.println(sb1);
    }
}
