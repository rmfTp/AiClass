package exam05;

public class ex05 extends Book {
    public static void main(String[] args) {
        Book b1 = new Book(1000,"책1","저자1","출판사1");
        Book b2 = new Book(1000,"책1","저자1","출판사1");
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
    }
}