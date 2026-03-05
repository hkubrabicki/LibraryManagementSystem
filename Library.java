package lab_project;

public class Library {

    private Book[] books;
    private User[] users;
    private Transaction[] transactions;
    private int bookCount;
    private int userCount;
    private int transactionCount;

    public Library() {
        books = new Book[100];
        users = new User[50];
        transactions = new Transaction[200];
        bookCount = 0;
        userCount = 0;
        transactionCount = 0;
    }

    public void addBook(String title, String author, int copies) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAuthor().equals(author)) {
                books[i].addCopies(copies);
                System.out.println("Updated copies for book: " + title);
                return;
            }
        }
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author, copies);
            System.out.println("Added new book: " + title);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void registerUser(String name, String email) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getEmail().equals(email)) {
                System.out.println("User with email " + email + " already exists.");
                System.out.println("Please produce a new email..");
                return;
            }
        }
        if (userCount < users.length) {
            users[userCount++] = new User(name, email);
            System.out.println("Registered new user: " + name);
        } else {
            System.out.println("User limit reached. Cannot register more users.");
        }
    }

    public void borrowBook(String email, String title, String author, String date) {
        User user = findUserByEmail(email);
        Book book = findBookByTitleAndAuthor(title, author);

        if (user == null) {
            System.out.println("User not be registered.");
            return;
        }
        if (book == null || book.getAvailableCopies() <= 0) {
            System.out.println("Book is not available.");
            return;
        }

        user.borrowBook(book);
        transactions[transactionCount++] = new Transaction(user, book, "Borrow", date);
        System.out.println("Book borrowed: " + title + " from the " + user.getName());
    }

    public void returnBook(String email, String title, String author, String date) {
        User user = findUserByEmail(email);
        Book book = findBookByTitleAndAuthor(title, author);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        user.returnBook(book);
        transactions[transactionCount++] = new Transaction(user, book, "Return", date);
        System.out.println("Book returned: " + title + " from the " + user.getName());
    }

    public void displayBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", Available copies: " + books[i].getAvailableCopies());
        }
    }

    public void displayTransactions() {
        for (int i = 0; i < transactionCount; i++) {
            transactions[i].printDetails();
        }
    }

    private User findUserByEmail(String email) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    private Book findBookByTitleAndAuthor(String title, String author) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;
    }

}
