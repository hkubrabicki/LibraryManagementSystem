package lab_project;

public class Transaction {
    private User user;
    private Book book;
    private String type;
    private String date;

    public Transaction(User user, Book book, String type, String date) {
        this.user = user;
        this.book = book;
        this.type = type;
        this.date = date;
    }

    public void printDetails() {
        System.out.println("Transaction: " + type + " | Book: " + book.getTitle() + " by " + book.getAuthor() + " | User: " + user.getName() + " | Date: " + date);
    }
}
