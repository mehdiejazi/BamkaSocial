package ir.bamka.social.model.to;

import java.util.List;

public class User {
    private int userId = -1;
    private String userName;
    private String name;
    private String familyName;
    private int Disabled;
    private Image avatarImage;
    private Image coverImage;
    private String password;
    private String regdate;

    private UserSettings userSettings;
    private List<UserActivation> userActivations;
    private List<UserLog> userActLog;
    private List<UserSearch> userSearches;

    private List<Post> posts;

    private List<OffComment> offComments;
    private List<OffLike> offLikes;
    private List<OffReport> offReports;
    private List<OffSeen> offSeens;

    private List<VocherComment> vocherComments;
    private List<VocherLike> vocherLikes;
    private List<VocherReport> vocherReports;
    private List<VocherSeen> vocherSeens;
}
