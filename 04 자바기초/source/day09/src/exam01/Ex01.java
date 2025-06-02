package exam01;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();

        members.put("user01", "회원1");
        members.put("user02", "회원2");
        members.put("user03", "회원3");
        members.put("user04", "회원4");
        String user3 = members.get("user03");
        System.out.println(user3);

        members.put("user03", "(수정)회원3");
        user3 = members.get("user03");
        System.out.println(user3);
        members.remove("user03");
        user3 = members.get("user03");
        System.out.println(user3);

        user3 = members.getOrDefault("user03","기본값");
        System.out.println(user3);
    }
}
