package ir.bamka.social.model.to;

public class Banner {
    private int bnrId;
    private String caption;
    private int publish;
    private String dtStamp = " ";
    private Category category;
    private Image image;

    public int getBnrId() {
        return bnrId;
    }

    public void setBnrId(int bnrId) {
        this.bnrId = bnrId;
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
