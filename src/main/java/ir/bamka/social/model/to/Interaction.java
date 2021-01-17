package ir.bamka.social.model.to;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Interaction {
    @Id
    @GeneratedValue
    private Long Id;
    private String dtstamp;
    private String text = "";
    private boolean deleted;
    private boolean publish;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
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
