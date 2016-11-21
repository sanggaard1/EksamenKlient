package SDK.views;

import java.util.ArrayList;
import java.util.Scanner;

import SDK.connection.ResponseCallback;
import SDK.controller.Controller;
import SDK.models.Book;
import SDK.services.BookService;

/**
 * Created by Sanggaard on 17/11/2016.
 */
public class UserMainView {

    private Controller controller;
    private BookService bookService;
    private Scanner reader;

    public UserMainView(Controller controller, BookService bookService) {
        this.controller = controller;
        this.bookService = bookService;
    }

    public void overMenu() {
        System.out.println("====== Books menu ======");
        System.out.println();
        System.out.println("(1) - Show all books");
        System.out.println("(2) - Show book by ID");
        System.out.println("(3) - Create new book");
        System.out.println();
        System.out.println("(4) - Back to main menu");
        System.out.println();

    }

    public void showAllBooks() {

        System.out.println("__Vis Boeger__");

        bookService.getBooks(new ResponseCallback<ArrayList<Book>>() {
            public void success(ArrayList<Book> books) {

                for(Book book : books){
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("PriceSaxo: " + book.getPriceSAXO());
                    System.out.println("PriceCdon: " + book.getPriceCDON());
                    System.out.println("PriceAB: " + book.getPriceAB());
                    System.out.println("ISBN: " + book.getISBN());
                    System.out.println("Publisher: " + book.getPublisher());
                    System.out.println("BookID: " + book.getBookID());

                }

            }

            public void error(int status) {
                System.out.println(status);
            }
        });

    }


}
