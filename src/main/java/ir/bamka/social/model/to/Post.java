package ir.bamka.social.model.to;

public class Post {

   private  int postid;
   private int userid;
   private String titr;
   private String posttext;
   private int accessring;
   private String senddate;
   private String sendtime;
   private int deleted;
   private int publish;
   private int offid =-1;
   private int vocherid =-1;
   private int parentid =-1;

   private User owner;
   private Off off;
   private Vocher vocher;
   private Post parent;

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public int getOffid() {
        return offid;
    }

    public void setOffid(int offid) {
        this.offid = offid;
    }

    public int getVocherid() {
        return vocherid;
    }

    public void setVocherid(int vocherid) {
        this.vocherid = vocherid;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
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

    public Vocher getVocher() {
        return vocher;
    }

    public void setVocher(Vocher vocher) {
        this.vocher = vocher;
    }

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }
}
