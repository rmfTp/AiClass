package exam05;

import static java.lang.System.identityHashCode;

public class ex02 extends Book {
    public static void main(String[] args) {
        Book b1 = new Book(1000,"책1","저자1","출판사1");
        int hashcode = b1.hashCode();
        System.out.printf("hashcode=%d, System.identityHashCode=%d%n",hashcode,identityHashCode(b1));
        System.out.println(b1);
    }
}
