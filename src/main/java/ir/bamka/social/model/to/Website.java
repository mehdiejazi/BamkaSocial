package ir.bamka.social.model.to;

public class Website {
    private int WebsiteId;
    private String WebsiteName;
    private String WebsiteUrl;
    private int UserId;
    private String Pdate;
    private String Time;

    private ir.bamka.social.model.to.User User;

    public int getWebsiteId() {
        return WebsiteId;
    }

    public void setWebsiteId(int websiteId) {
        WebsiteId = websiteId;
    }

    public String getWebsiteName() {
        return WebsiteName;
    }

    public void setWebsiteName(String websiteName) {
        WebsiteName = websiteName;
    }

    public String getWebsiteUrl() {
        return WebsiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        WebsiteUrl = websiteUrl;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getPdate() {
        return Pdate;
    }

    public void setPdate(String pdate) {
        Pdate = pdate;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public ir.bamka.social.model.to.User getUser() {
        return User;
    }

    public void setUser(ir.bamka.social.model.to.User user) {
        User = user;
    }
}
