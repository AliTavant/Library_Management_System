import java.util.ArrayList;

public class LibraryManagement implements LibraryManagementservice{

    private ArrayList<Book> booklist=new ArrayList<>();

    @Override
    public void addNewbook(int bookid, String author, String isbn,String title) {
        Book bk=new Book(bookid,author,isbn,Status.A,title);
        booklist.add(bk);
    }

    @Override
    public void removeBook(String title){
        System.out.println("---------------------------------------");
        try{
            Book b1=searchBook(title);
            booklist.remove(b1);
            System.out.println("Book removed Sucessfully");
        }
        catch(BookNotfoundexception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Book searchBook(String title) throws BookNotfoundexception {
        System.out.println("---------------------------------");
        for(Book bk:booklist){
            if(bk.getTitle().equals(title)){
                System.out.println("title "+bk.getTitle()+" author "+bk.getAuthor()+" ISBN "+bk.getIsbn()+" status "+bk.getStatus());
                System.out.println("Book found Sucessfully");
                return bk;
            }
        }
        throw new BookNotfoundexception("Book Not found Title "+title);
    }

    public void displayAllbook() throws NoBookpresent{
        System.out.println("---------------------------------");
        if(booklist.isEmpty()){
            throw new NoBookpresent("Library is Empty");
        }
        System.out.println("book menu");
        for(Book bk:booklist){
            System.out.println("title "+bk.getTitle()+" author "+bk.getAuthor()+" ISBN "+bk.getIsbn()+" status "+bk.getStatus());
        }
        System.out.println("---------------------------------");
    }

    public void updateBookdeatils(String oldtitle,String newtitle,Status status,String author,String isbn){
        try{
            Book b1=searchBook(oldtitle);
            b1.setStatus(status);
            b1.setAuthor(author);
            b1.setIsbn(isbn);
            b1.setTitle(newtitle);
            System.out.println("title "+b1.getTitle()+" author "+b1.getAuthor()+" ISBN "+b1.getIsbn()+" status "+b1.getStatus());
        }
        catch(BookNotfoundexception e){
            System.out.println(e.getMessage());
        }
    }
}
