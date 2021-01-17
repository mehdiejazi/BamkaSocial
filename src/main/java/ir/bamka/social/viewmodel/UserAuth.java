package ir.bamka.social.viewmodel;

public class UserAuth {
    private String UserName;
    private String Password;

    public UserAuth() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}