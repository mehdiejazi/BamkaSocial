package ir.bamka.social.model.to;


public class Message {

    private int msgId;
    private String subject;
    private String msg;
    private int msgFromUserId = -1; // -1 = admin
    private int msgToUserId = -1000; // -1000 = *
    private int msgPublish = 0;
    private String gdate;
    private String pdate;
    private String time;
    private User FromUser;
    private User ToUser;
    private Image image;

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getMsgFromUserId() {
        return msgFromUserId;
    }

    public void setMsgFromUserId(int msgFromUserId) {
        this.msgFromUserId = msgFromUserId;
    }

    public int getMsgToUserId() {
        return msgToUserId;
    }

    public void setMsgToUserId(int msgToUserId) {
        this.msgToUserId = msgToUserId;
    }

    public int getMsgPublish() {
        return msgPublish;
    }

    public void setMsgPublish(int msgPublish) {
        this.msgPublish = msgPublish;
    }

    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getFromUser() {
        return FromUser;
    }

    public void setFromUser(User fromUser) {
        FromUser = fromUser;
    }

    public User getToUser() {
        return ToUser;
    }

    public void setToUser(User toUser) {
        ToUser = toUser;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
