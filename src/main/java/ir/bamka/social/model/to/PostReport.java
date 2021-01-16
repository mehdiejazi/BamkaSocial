package ir.bamka.social.model.to;


public class PostReport {
    private int postReportId;
    private String dtstamp;
    private String text = "";
    private boolean deleted;
    private boolean publish;

    public int getPostReportId() {
        return postReportId;
    }

    public void setPostReportId(int postReportId) {
        this.postReportId = postReportId;
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
        this.text = text;
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
}
