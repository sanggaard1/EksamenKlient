package SDK.models;

import java.sql.Timestamp;

/**
 * Created by Sanggaard on 18/11/2016.
 */
public class AccessToken {

    private int id;
    private String token;
    private int user_id;
    private User user;

    public AccessToken(int id, String token, int user_id, User user) {
        this.id = id;
        this.token = token;
        this.user_id = user_id;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

