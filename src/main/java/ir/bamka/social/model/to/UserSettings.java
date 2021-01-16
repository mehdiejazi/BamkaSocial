package ir.bamka.social.model.to;

public class UserSettings {
    private int notifUnseenOff = 0;
    private int notifUnseenSpecialOff=0;
    private int notifUnseenMessage=0;
    private int notifUnseenVocher=0;
    private int notifUnseenSpecialVocher=0;

    public int getNotifUnseenOff() {
        return notifUnseenOff;
    }

    public void setNotifUnseenOff(int notifUnseenOff) {
        this.notifUnseenOff = notifUnseenOff;
    }

    public int getNotifUnseenSpecialOff() {
        return notifUnseenSpecialOff;
    }

    public void setNotifUnseenSpecialOff(int notifUnseenSpecialOff) {
        this.notifUnseenSpecialOff = notifUnseenSpecialOff;
    }

    public int getNotifUnseenMessage() {
        return notifUnseenMessage;
    }

    public void setNotifUnseenMessage(int notifUnseenMessage) {
        this.notifUnseenMessage = notifUnseenMessage;
    }

    public int getNotifUnseenVocher() {
        return notifUnseenVocher;
    }

    public void setNotifUnseenVocher(int notifUnseenVocher) {
        this.notifUnseenVocher = notifUnseenVocher;
    }

    public int getNotifUnseenSpecialVocher() {
        return notifUnseenSpecialVocher;
    }

    public void setNotifUnseenSpecialVocher(int notifUnseenSpecialVocher) {
        this.notifUnseenSpecialVocher = notifUnseenSpecialVocher;
    }
}
