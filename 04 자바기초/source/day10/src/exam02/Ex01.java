package exam02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        String value = null;//"안녕";
        Optional<String> opt = Optional.ofNullable(value);
//        String value2 = opt.orElse("default");//null 이면 default
//        System.out.println(value2);
        String value2 = opt.orElseGet(()->{
            return "default";
        });
        System.out.println(value2);
    }
}
