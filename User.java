package lab_project;

public class User {
    private String name;
    private String email;
    private Book[] borrowedBooks;
    private int borrowedCount;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.borrowedBooks = new Book[3];
        this.borrowedCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void borrowBook(Book book) {
        if (borrowedCount < 3) {
            borrowedBooks[borrowedCount++] = book;
            book.borrowCopy();
        } else {
            System.out.println("Cannot borrow more than 3 books.");
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] != null && borrowedBooks[i].equals(book)) {
                borrowedBooks[i] = null;
                book.returnCopy();
                for (int j = i; j < borrowedCount - 1; j++) {
                    borrowedBooks[j] = borrowedBooks[j + 1];
                }
                borrowedBooks[--borrowedCount] = null;
                return;
            }
        }
    }
}