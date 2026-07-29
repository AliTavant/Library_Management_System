import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryManagement library = new LibraryManagement();

        int choice;

        do {

            System.out.println("\n========== Library Management System ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book");
            System.out.println("5. Update Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();



                    library.addNewbook(id, author, isbn, title);

                    break;

                case 2:

                    System.out.print("Enter Book Title to Remove: ");
                    String removeTitle = sc.nextLine();

                    library.removeBook(removeTitle);

                    break;

                case 3:
                    try {
                        library.displayAllbook();
                    }
                    catch(NoBookpresent e){
                        System.out.println(e.getMessage());
                    }

                    break;

                case 4:

                    System.out.println("Search By Title");
                    System.out.print("Enter Title: ");
                    String searchTitle = sc.nextLine();
                    try {
                        Book b1=library.searchBook(searchTitle);
                    }
                    catch(BookNotfoundexception e){
                        System.out.println(e.getMessage());
                    }



                    break;

                case 5:

                    System.out.print("Enter Book Title to Update: ");
                    String oldTitle = sc.nextLine();

                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New ISBN: ");
                    String newIsbn = sc.nextLine();

                    System.out.print("Enter Status (A/NA): ");
                    String statusInput = sc.nextLine();
                    Status status = Status.valueOf(statusInput.toUpperCase());
                    library.updateBookdeatils(oldTitle, newTitle, status, newAuthor, newIsbn);

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();
    }
}