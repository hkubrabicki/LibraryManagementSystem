package lab_project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add a New Book");
            System.out.println("2. Register a New User");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Display All Books");
            System.out.println("6. View Transactions");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Number of Copies: ");
                    int copies = scanner.nextInt();
                    library.addBook(title, author, copies);
                    break;

                case 2:
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter User Email: ");
                    String email = scanner.nextLine();
                    library.registerUser(name, email);
                    break;

                case 3:
                    System.out.print("Enter User Email: ");
                    String userEmail = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String borrowAuthor = scanner.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String borrowDate = scanner.nextLine();
                    library.borrowBook(userEmail, borrowTitle, borrowAuthor, borrowDate);
                    break;

                case 4:
                    System.out.print("Enter User Email: ");
                    String returnEmail = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String returnTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String returnAuthor = scanner.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String returnDate = scanner.nextLine();
                    library.returnBook(returnEmail, returnTitle, returnAuthor, returnDate);
                    break;

                case 5:
                    library.displayBooks();
                    break;

                case 6:
                    library.displayTransactions();
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
