package exam03;

public class ex06 {
    public static void main(String[] args) throws ClassNotFoundException{
        //Class cls = Book.class;
        Class cls = Class.forName("exam01.Book");
        long num = Math.round(Math.random() * 100) ;
        System.out.println(num);
    }
}
