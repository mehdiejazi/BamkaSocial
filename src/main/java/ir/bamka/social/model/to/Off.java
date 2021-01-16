package ir.bamka.social.model.to;

import java.util.List;

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
    private int likeCount = 0;
    private int commentCount = 0;
    private List<Category> categories;
    private List<OffLike> offLikes;
    private List<OffComment> offComments;
    private List<OffReport> offReports;
    private List<OffSeen> offSeens;

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

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
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

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<OffLike> getOffLikes() {
        return offLikes;
    }

    public void setOffLikes(List<OffLike> offLikes) {
        this.offLikes = offLikes;
    }

    public List<OffComment> getOffComments() {
        return offComments;
    }

    public void setOffComments(List<OffComment> offComments) {
        this.offComments = offComments;
    }

    public List<OffReport> getOffReports() {
        return offReports;
    }

    public void setOffReports(List<OffReport> offReports) {
        this.offReports = offReports;
    }

    public List<OffSeen> getOffSeens() {
        return offSeens;
    }

    public void setOffSeens(List<OffSeen> offSeens) {
        this.offSeens = offSeens;
    }
}