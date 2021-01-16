package ir.bamka.social.model.to;

public class Off {
    private int offId;
    private String url;
    private String caption;
    private String location;
    private String score;
    private String offpercent;
    private String offprice;
    private String price;
    private String imageurl;
    private String shorturl;
    private String offwebsite;
    private int catId;
    private int publish;
    private String publishdate;
    private String publishtime;
    private String senddate;
    private String sendtime;
    private int send;
    private String tag;
    private String sha1tag;
    private int deleted;
    private int special;
    private Category categoryTO;
    private InteractionBase favOffTO;
    private int FavCount = 0;
    private int CommentCount = 0;

    public Off() {
    }

    public int getOffId() {
        return offId;
    }

    public void setOffId(int offId) {
        this.offId = offId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getOffpercent() {
        return offpercent;
    }

    public void setOffpercent(String offpercent) {
        this.offpercent = offpercent;
    }

    public String getOffprice() {
        return offprice;
    }

    public void setOffprice(String offprice) {
        this.offprice = offprice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getOffwebsite() {
        return offwebsite;
    }

    public void setOffwebsite(String offwebsite) {
        this.offwebsite = offwebsite;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getSenddate() {
        return senddate;
    }

    public void setSenddate(String senddate) {
        this.senddate = senddate;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSha1tag() {
        return sha1tag;
    }

    public void setSha1tag(String sha1tag) {
        this.sha1tag = sha1tag;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public Category getCategoryTO() {
        return categoryTO;
    }

    public void setCategoryTO(Category categoryTO) {
        this.categoryTO = categoryTO;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public InteractionBase getFavOffTO() {
        return favOffTO;
    }

    public void setFavOffTO(InteractionBase favOffTO) {
        this.favOffTO = favOffTO;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getFavCount() {
        return FavCount;
    }

    public void setFavCount(int favCount) {
        FavCount = favCount;
    }

    public int getCommentCount() {
        return CommentCount;
    }

    public void setCommentCount(int commentCount) {
        CommentCount = commentCount;
    }
}