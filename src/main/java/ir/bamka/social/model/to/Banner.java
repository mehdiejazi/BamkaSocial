package ir.bamka.social.model.to;

public class Banner {
    private int bnrId;
    private String imageurl;
    private int publish;
    private String dtStamp = " ";
    private Category categoryTO;

    public Banner() {
    }

    public Banner(String imageurl) {
        this.imageurl = imageurl;
    }

    public int getBnrId() {
        return bnrId;
    }

    public void setBnrId(int bnrId) {
        this.bnrId = bnrId;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
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

    public Category getCategoryTO() {
        return categoryTO;
    }

    public void setCategoryTO(Category categoryTO) {
        this.categoryTO = categoryTO;
    }
}
