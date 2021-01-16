package ir.bamka.social.model.to;

public class User {
    private int userId = -1;
    private String Username;
    private String Name;
    private String Familyname;
    private int Disabled;
    private String Avatarurl;
    private String Password;
    private String Regdate;
    private UserLog LastLogin = new UserLog();
    private UserSettings userSettingsTO = new UserSettings();

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamilyname() {
        return Familyname;
    }

    public void setFamilyname(String familyname) {
        Familyname = familyname;
    }

    public int getDisabled() {
        return Disabled;
    }

    public void setDisabled(int disabled) {
        Disabled = disabled;
    }

    public String getAvatarurl() {
        return Avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        Avatarurl = avatarurl;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRegdate() {
        return Regdate;
    }

    public void setRegdate(String regdate) {
        Regdate = regdate;
    }

    public String getFullName() {
        String strName = "";
        String strFamily = "";

        try {
            strName = getName().trim();
        } catch (Exception ex) {
        }
        try {
            strFamily = getFamilyname().trim();
        } catch (Exception ex) {
        }

        return (strName + " " + strFamily.trim()).trim();
    }

    public UserLog getLastLogin() {
        return LastLogin;
    }

    public void setLastLogin(UserLog lastLogin) {
        LastLogin = lastLogin;
    }

    public UserSettings getUserSettingsTO() {
        return userSettingsTO;
    }

    public void setUserSettingsTO(UserSettings userSettingsTO) {
        this.userSettingsTO = userSettingsTO;
    }
}
