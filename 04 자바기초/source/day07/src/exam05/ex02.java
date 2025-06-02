package exam05;


import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        List<String> items = List.of("이름1","이름2","이름3");

        String[] items2 = items.stream().toArray(i -> new String[i]);
    }
}
