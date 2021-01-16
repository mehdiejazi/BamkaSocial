package ir.bamka.social.model.viewmodel;

public class UserActive {
    private String UserName;
    private String Code;

    public UserActive(String userName, String code) {
        UserName = userName;
        Code = code;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
}
