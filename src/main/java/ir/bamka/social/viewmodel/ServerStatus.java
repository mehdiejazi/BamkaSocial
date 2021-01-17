package ir.bamka.social.viewmodel;

import ir.bamka.social.model.to.User;

public class ServerStatus {
    private User userTO;
    private String status;
    private String minimumVersion;
    private String currentVersion;

    public User getUserTO() {
        return userTO;
    }

    public void setUserTO(User userTO) {
        this.userTO = userTO;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMinimumVersion() {
        return minimumVersion;
    }

    public void setMinimumVersion(String minimumVersion) {
        this.minimumVersion = minimumVersion;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }
}
