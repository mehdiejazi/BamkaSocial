package ir.bamka.social.model.to;

import java.util.List;

public class Vocher {
    private int vocherId;
    private String url;
    private String shorturl;
    private String caption;
    private String imageurl;
    private String vocherwebsite;
    private String category;
    private String msg;
    private String value;
    private String vocher;
    private String expdate;
    private String publishdate;
    private String publishtime;
    private String sentdate;
    private String senttime;
    private String sent;
    private String tag;
    private String sha1tag;
    private int deleted;
    private int publish;
    private int catId;
    private int special;
    private Category categoryTO;
    private int likeCount = 0;
    private int commentCount = 0;
    private List<Category> categories;
    private List<VocherLike> vocherLikes;
    private List<VocherComment> vocherComments;
    private List<VocherReport> vocherReports;
    private List<VocherSeen> vocherSeens;

    public int getVocherId() {
        return vocherId;
    }

    public void setVocherId(int vocherId) {
        this.vocherId = vocherId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getVocherwebsite() {
        return vocherwebsite;
    }

    public void setVocherwebsite(String vocherwebsite) {
        this.vocherwebsite = vocherwebsite;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getVocher() {
        return vocher;
    }

    public void setVocher(String vocher) {
        this.vocher = vocher;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
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

    public String getSentdate() {
        return sentdate;
    }

    public void setSentdate(String sentdate) {
        this.sentdate = sentdate;
    }

    public String getSenttime() {
        return senttime;
    }

    public void setSenttime(String senttime) {
        this.senttime = senttime;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
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

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public Category getCategoryTO() {
        return categoryTO;
    }

    public void setCategoryTO(Category categoryTO) {
        this.categoryTO = categoryTO;
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

    public List<VocherLike> getVocherLikes() {
        return vocherLikes;
    }

    public void setVocherLikes(List<VocherLike> vocherLikes) {
        this.vocherLikes = vocherLikes;
    }

    public List<VocherComment> getVocherComments() {
        return vocherComments;
    }

    public void setVocherComments(List<VocherComment> vocherComments) {
        this.vocherComments = vocherComments;
    }

    public List<VocherReport> getVocherReports() {
        return vocherReports;
    }

    public void setVocherReports(List<VocherReport> vocherReports) {
        this.vocherReports = vocherReports;
    }

    public List<VocherSeen> getVocherSeens() {
        return vocherSeens;
    }

    public void setVocherSeens(List<VocherSeen> vocherSeens) {
        this.vocherSeens = vocherSeens;
    }
}
