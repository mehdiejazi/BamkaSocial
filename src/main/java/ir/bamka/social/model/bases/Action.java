package ir.bamka.social.model.bases;

public class Action {
    private int actId;
    private int userId;
    private int offId = -1;
    private int typId;
    private int vocherId = -1;
    private String dtstamp;
    private String text = "";
    private int deleted;
    private int publish;


    public Action() {
    }

    public Action(int typId) throws Exception {
        if (typId>10)
            throw new Exception("");
        this.typId = typId;
    }

    public int getActId() {
        return actId;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOffId() {
        return offId;
    }

    public void setOffId(int offId) {
        this.offId = offId;
    }

    public int getTypId() {
        return typId;
    }

    public void setTypId(int typId) {
        this.typId = typId;
    }

    public int getVocherId() {
        return vocherId;
    }

    public void setVocherId(int vocherId) {
        this.vocherId = vocherId;
    }

    public String getDtstamp() {
        return dtstamp;
    }

    public void setDtstamp(String dtstamp) {
        this.dtstamp = dtstamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {

        if (text == null) {
            this.text = "";
            return;
        }
        if (text.length() > 249)
            this.text = text.substring(0, 249);
        else
            this.text = text;

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
}
