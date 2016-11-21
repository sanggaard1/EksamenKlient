package SDK.services;

import SDK.connection.Connection;
import SDK.connection.ResponseCallback;
import SDK.connection.ResponseParser;
import SDK.models.Book;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import SDK.views.MainView;
import SDK.views.UserMainView;


import java.util.ArrayList;

/**
 * Created by Sanggaard on 17/11/2016.
 */
public class BookService {

    private Connection connection;
    private Gson gson;

    public BookService() {
        this.connection = new Connection();
        this.gson = new Gson();
    }

    public void getBooks(final ResponseCallback<ArrayList<Book>> responseCallback){

        HttpGet getRequest = new HttpGet(Connection.serverURL + "/book");
        this.connection.execute(getRequest, new ResponseParser() {
            public void payload(String json) {

                ArrayList<Book> books = gson.fromJson(json, new TypeToken<ArrayList<Book>>(){}.getType());
                responseCallback.success(books);
            }

            public void error(int status) {
                responseCallback.error(status);

            }
        });

    }
}

/*

public void getAll(final ResponseCallback<ArrayList<Book>> responseCallback){

        HttpGet getRequest = new HttpGet(Connection.serverURL + "/books");
        this.connection.execute(getRequest, new ResponseParser() {
            public void payload(String json) {

                ArrayList<Book> books = gson.fromJson(json, new TypeToken<ArrayList<Book>>(){}.getType());
                responseCallback.success(books);
            }

            public void error(int status) {
                responseCallback.error(status);




 */
