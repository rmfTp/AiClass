package exam05;

public class Book {
    public Book() {

    }

    private int isbn;
    private String title;
    private String author;
    private String publisher;

    public Book(int isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    @Override
    public String toString() {
        /*return String.format(
                "isbn=%d, title=%s, author=%s, publisher=%s",
                isbn, publisher, author, publisher
        );*/
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
