public interface LibraryManagementservice {
    public void addNewbook(int bookid, String author, String isbn,String title);
    public void removeBook(String title) throws BookNotfoundexception;
    public Book searchBook(String title) throws BookNotfoundexception;
}
