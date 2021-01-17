package ir.bamka.social.model.to;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_posts")
public class Post {

    @Id
    @GeneratedValue
    private Long Id;
    private String titr;
    private String posttext;
    private int accessring;
    private String senddate;
    private String sendtime;
    private boolean deleted;
    private boolean publish;

    @OneToOne
    private List<Image> images;

    @OneToOne
    private List<Category> categories;

    @ManyToOne
    private User owner;

    @ManyToOne
    private Off off;

    @ManyToOne
    private Voucher vocher;

    @ManyToOne
    private Post parent;

    @OneToMany
    private List<Interaction> postLikes;

    @OneToMany
    private List<Interaction> postComments;

    @OneToMany
    private List<Interaction> postReports;

    @OneToMany
    private List<Interaction> postSeens;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitr() {
        return titr;
    }

    public void setTitr(String titr) {
        this.titr = titr;
    }

    public String getPosttext() {
        return posttext;
    }

    public void setPosttext(String posttext) {
        this.posttext = posttext;
    }

    public int getAccessring() {
        return accessring;
    }

    public void setAccessring(int accessring) {
        this.accessring = accessring;
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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Off getOff() {
        return off;
    }

    public void setOff(Off off) {
        this.off = off;
    }

    public Voucher getVocher() {
        return vocher;
    }

    public void setVocher(Voucher vocher) {
        this.vocher = vocher;
    }

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public List<Interaction> getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(List<Interaction> postLikes) {
        this.postLikes = postLikes;
    }

    public List<Interaction> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<Interaction> postComments) {
        this.postComments = postComments;
    }

    public List<Interaction> getPostReports() {
        return postReports;
    }

    public void setPostReports(List<Interaction> postReports) {
        this.postReports = postReports;
    }

    public List<Interaction> getPostSeens() {
        return postSeens;
    }

    public void setPostSeens(List<Interaction> postSeens) {
        this.postSeens = postSeens;
    }
}
