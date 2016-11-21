package SDK;

import SDK.connection.ResponseCallback;
import SDK.controller.Controller;
import SDK.models.Book;
import SDK.services.BookService;

import java.util.ArrayList;

import SDK.Config;
import com.google.gson.JsonObject;

public class BookShop {

    private Controller controller;
    private static BookService bookService;

    public BookShop() {
        this.controller = new Controller();
        bookService = new BookService();
    }

    public static void main(String[] args) {
        //new Config().initConfig();
        //new BookShop().run();

        JsonObject jsonObject = new Config().initConfig();
        System.out.println(jsonObject.get("DbUrl"));

/*
        bookService.getAll(new ResponseCallback<ArrayList<Book>>() {
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
        */
    }

    public void run() {

        while (true) {
            this.controller.showMainView();
        }


    }
}
