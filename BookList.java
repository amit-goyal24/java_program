import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Title: \"" + title + "\", Author: \"" + author + "\", Price: " + price;
    }
}

public class BookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            books.add(new Book(title, author, price));
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}