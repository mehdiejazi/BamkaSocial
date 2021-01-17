package ir.bamka.social.model.to;

import javax.persistence.*;

@Entity
@Table(name = "tbl_messages")
public class Message {

    @Id
    @GeneratedValue
    private Long Id;
    private String subject;
    private String body;

    private boolean msgPublish;

    private String sendDate;
    private String sendTime;

    private String publishDate;
    private String publishTime;

    @ManyToOne
    private User FromUser;

    @ManyToOne
    private User ToUser;

    @ManyToOne
    private Image image;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isMsgPublish() {
        return msgPublish;
    }

    public void setMsgPublish(boolean msgPublish) {
        this.msgPublish = msgPublish;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
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
