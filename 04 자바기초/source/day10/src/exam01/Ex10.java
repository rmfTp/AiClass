package exam01;

import java.util.List;
import java.util.stream.Stream;

public class Ex10 {
    public static void main(String[] args) {
        List<String> items = Stream.of("AA","BB","CC","AAA","BBB","CCC","DD").filter(s->s.length() == 2).toList();

        System.out.println(items);
    }
}
