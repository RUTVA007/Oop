class BookNotAvailableException extends Exception {
    
    // Constructor
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Library {
    private int availableBooks;

    // Constructor
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Method to issue books
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class LibraryTest {
    public static void main(String[] args) {

        Library lib = new Library(3); // Initialize with 3 books

        try {
            // First attempt (valid)
            lib.issueBook(2);

            // Second attempt (invalid)
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Library transaction completed");
        }
    }
}
