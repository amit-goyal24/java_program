import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class LibraryMember {
    int memberId;
    String memberName;
    ArrayList<Book> borrowedBooks;

    public LibraryMember(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {
            borrowedBooks.add(book);
            System.out.println("Book borrowed successfully: " + book.title);
        } else {
            System.out.println("Maximum borrow limit reached.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println("Book returned successfully: " + book.title);
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    @Override
    public String toString() {
        return "Member: " + memberName + ", Borrowed Books: " + borrowedBooks;
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryMember alice = new LibraryMember(1, "Alice");

        // Add books to the library (you can create a library class to manage books)
        Book alchemist = new Book("The Alchemist");
        Book mockingbird = new Book("To Kill a Mockingbird");
        Book prideAndPrejudice = new Book("Pride and Prejudice");

        // Borrow books
        alice.borrowBook(alchemist);
        alice.borrowBook(mockingbird);
        alice.borrowBook(prideAndPrejudice); // Will print a message about the limit

        // Return a book
        alice.returnBook(mockingbird);

        System.out.println(alice);
    }
}