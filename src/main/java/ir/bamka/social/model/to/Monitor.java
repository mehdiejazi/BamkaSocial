package ir.bamka.social.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_monitor")
public class Monitor {
    @Id
    @GeneratedValue
    private Long Id;
    private String pDate;
    private int reqCount;

    public Monitor() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public int getReqCount() {
        return reqCount;
    }

    public void setReqCount(int reqCount) {
        this.reqCount = reqCount;
    }
}
