
enum Status{
    A,
    NA
};

public class Book {
    private int bookid;
    private String author;
    private String Isbn;
    private Status status;
    private String title;

    public Book(int bookid, String author, String isbn, Status status,String title) {
        this.bookid = bookid;
        this.author = author;
        Isbn = isbn;
        this.status = status;
        this.title=title;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
