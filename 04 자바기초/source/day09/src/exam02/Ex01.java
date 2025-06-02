package exam02;

import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Orange", "Melon");

        items.forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        items.forEach(x -> System.out.println(x));
        items.forEach(System.out::println);
    }
}
