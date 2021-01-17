package ir.bamka.social.model.to;

import javax.persistence.*;

@Entity
@Table(name = "tbl_banners")
public class Banner {

    @Id
    @GeneratedValue
    private Long Id;
    private String caption;
    private int publish;
    private String dtStamp = " ";
    private String sendDate;
    private String sendTime;

    @ManyToOne
    private User owner;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Image image;

    public long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public String getDtStamp() {
        return dtStamp;
    }

    public void setDtStamp(String dtStamp) {
        this.dtStamp = dtStamp;
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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
