package ir.bamka.social.model.to;

public class UserLog {

    private long id;
    private String IP;
    private String Event;
    private String GDate;
    private String PDate;
    private String Time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String Event) {
        this.Event = Event;
    }

    public String getGDate() {
        return GDate;
    }

    public void setGDate(String GDate) {
        this.GDate = GDate;
    }

    public String getPDate() {
        return PDate;
    }

    public void setPDate(String PDate) {
        this.PDate = PDate;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
}
