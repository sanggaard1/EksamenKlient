package SDK.models;

/**
 * Created by Sanggaard on 17/11/2016.
 */
public class User extends BaseModel {

    private int UserID;
    private String First_Name;
    private String Last_Name;
    private String Username;
    private String Password;
    private int UserType;

    public User(int userID, String first_Name, String last_Name, String username, String password, int userType) {
        UserID = userID;
        First_Name = first_Name;
        Last_Name = last_Name;
        Username = username;
        Password = password;
        UserType = userType;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getUserType() {
        return UserType;
    }

    public void setUserType(int userType) {
        UserType = userType;
    }
}
