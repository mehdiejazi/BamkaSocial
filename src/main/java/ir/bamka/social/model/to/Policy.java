package ir.bamka.social.model.to;

public class Policy {
    private int plcId;
    private String title = "";
    private String policy = "";
    private int publish = 0;

    public int getPlcId() {
        return plcId;
    }

    public void setPlcId(int plcId) {
        this.plcId = plcId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }
}
