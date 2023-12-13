import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       demoBookStore();
    }

    private static void demoBookStore() {
        Book b1 = new Book("one","Dear",100.0);
        Book b2 = new Book("Two","Dear",50.0);
        Book b3 = new Book("Three","Dear",60.0);
        Book b4 = new Book("Four","Dear",150.0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        BookStore bookStore = new BookStore("DEAR'SHOP",5);
        bookStore.addBook(b2);
        System.out.println( bookStore.addBook(b3));
        System.out.println(bookStore.addBook(b4));
        bookStore.addBook(b1);
        System.out.println(Arrays.toString(bookStore.getAllBooks()));
        bookStore.sellBook(1);
        System.out.println(Arrays.toString(bookStore.getAllBooks()));


    }
}