package ir.bamka.social.model.to;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Voucher {

    @Id
    @GeneratedValue
    private Long Id;
    private String url;
    private String shorturl;
    private String caption;
    private String imageurl;
    private String website;
    private String category;
    private String msg;
    private String value;
    private String voucher;
    private String expDate;
    private String publishDate;
    private String publishTime;
    private String sentDate;
    private String sentTime;
    private String sent;
    private String tag;
    private String sha1tag;
    private boolean deleted;
    private boolean publish;
    private boolean special;

    private int likeCount = 0;
    private int commentCount = 0;

    @OneToMany
    private List<Category> categories;

    @OneToMany
    private List<Interaction> vocherLikes;

    @OneToMany
    private List<Interaction> vocherComments;

    @OneToMany
    private List<Interaction> vocherReports;

    @OneToMany
    private List<Interaction> vocherSeens;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
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

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getSentTime() {
        return sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isPublish() {
        return publish;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
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

    public List<Interaction> getVocherLikes() {
        return vocherLikes;
    }

    public void setVocherLikes(List<Interaction> vocherLikes) {
        this.vocherLikes = vocherLikes;
    }

    public List<Interaction> getVocherComments() {
        return vocherComments;
    }

    public void setVocherComments(List<Interaction> vocherComments) {
        this.vocherComments = vocherComments;
    }

    public List<Interaction> getVocherReports() {
        return vocherReports;
    }

    public void setVocherReports(List<Interaction> vocherReports) {
        this.vocherReports = vocherReports;
    }

    public List<Interaction> getVocherSeens() {
        return vocherSeens;
    }

    public void setVocherSeens(List<Interaction> vocherSeens) {
        this.vocherSeens = vocherSeens;
    }
}
