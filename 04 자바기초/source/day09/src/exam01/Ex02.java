package exam01;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();

        members.put("user01", "회원1");
        members.put("user02", "회원2");
        members.put("user03", "회원3");
        members.put("user04", "회원4");
        members.put("user05", "회원5");
//        Set<Map.Entry<String, String>> entries = members.entrySet();
//        for (Map.Entry<String, String> entry : entries){
        for (Map.Entry<String, String> entry : members.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
