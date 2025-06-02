package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        List<Book> items = List.of(
                new Book(1000, "책1", "저자1"),
                new Book(1001, "책2", "저자2"),
                new Book(1002, "책3", "저자2"),
                new Book(1003, "책4", "저자3"),
                new Book(1004, "책5", "저자3")
        );
        Map<String,List<Book>> items2 = items.stream().collect(Collectors.groupingBy(Book::getAuthor));
        System.out.println(items2);
        List<Book> items3 = items2.get("저자2");
        items3.forEach(System.out::println);

        ArrayList<String> items4 = items.stream().map(Book::getTitle).collect(Collectors.toCollection(ArrayList::new));
        items4.forEach(System.out::println);

        String books = items.stream().map(Book::getTitle).collect(Collectors.joining(","));
        System.out.println(books);
    }
}