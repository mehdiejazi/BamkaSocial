package ir.bamka.social.model.to;

public class UserActivation {
    private int actcodeID;
    private String code;
    private String genDate;
    private String expDate;
    private int disabled;


    public UserActivation() {
        setActcodeID(-1);
    }

    public int getActcodeID() {
        return actcodeID;
    }

    public void setActcodeID(int actcodeID) {
        this.actcodeID = actcodeID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGenDate() {
        return genDate;
    }

    public void setGenDate(String genDate) {
        this.genDate = genDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }
}
