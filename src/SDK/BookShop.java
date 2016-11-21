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
        //Tidligere versioner:
        //new Config().initConfig();
        //new BookShop().run();

        JsonObject jsonObject = new Config().initConfig();
        System.out.println(jsonObject.get("DbUrl"));

    }

    public void run() {

        while (true) {
            this.controller.showMainView();
        }

    }
}
