package ir.bamka.social.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user_logs")
public class UserLog {

    @Id
    @GeneratedValue
    private Long Id;
    private String ip;
    private String event;
    private String gDate;
    private String pDate;
    private String time;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String Event) {
        this.event = Event;
    }

    public String getgDate() {
        return gDate;
    }

    public void setgDate(String gDate) {
        this.gDate = gDate;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
