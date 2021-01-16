package ir.bamka.social.model.to;

public class Monitor {
    private int monId;
    private String pDate;
    private int reqCount;

    public Monitor() {
    }

    public int getMonId() {
        return monId;
    }

    public void setMonId(int monId) {
        this.monId = monId;
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
