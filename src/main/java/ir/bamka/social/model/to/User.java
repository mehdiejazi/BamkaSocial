package ir.bamka.social.model.to;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_users")
public class User {
    @Id
    @GeneratedValue
    private Long Id;
    private String userName;
    private String password;
    private String name;
    private String familyName;
    private boolean disabled;

    @OneToOne
    private Image avatarImage;

    @OneToOne
    private Image coverImage;

    private String regdate;

    @OneToOne
    private UserSettings userSettings;

    @OneToMany
    private List<User> followingUsers;

    @OneToMany
    private List<Category> categoriesFollowed;

    @OneToMany
    private List<UserActivation> userActivations;

    @OneToMany
    private List<UserLog> userLogs;

    @OneToMany
    private List<UserSearch> userSearches;

    @OneToMany
    private List<Post> posts;

    @OneToMany
    private List<Interaction> offComments;

    @OneToMany
    private List<Interaction> offLikes;

    @OneToMany
    private List<Interaction> offReports;

    @OneToMany
    private List<Interaction> offSeens;

    @OneToMany
    private List<Interaction> voucherComments;

    @OneToMany
    private List<Interaction> voucherLikes;

    @OneToMany
    private List<Interaction> voucherReports;

    @OneToMany
    private List<Interaction> voucherSeens;


    @OneToMany
    private List<Interaction> PostComments;

    @OneToMany
    private List<Interaction> PostLikes;

    @OneToMany
    private List<Interaction> PostReports;

    @OneToMany
    private List<Interaction> PostSeens;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Image getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(Image avatarImage) {
        this.avatarImage = avatarImage;
    }

    public Image getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(Image coverImage) {
        this.coverImage = coverImage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    public List<User> getFollowingUsers() {
        return followingUsers;
    }

    public void setFollowingUsers(List<User> followingUsers) {
        this.followingUsers = followingUsers;
    }

    public List<Category> getCategoriesFollowed() {
        return categoriesFollowed;
    }

    public void setCategoriesFollowed(List<Category> categoriesFollowed) {
        this.categoriesFollowed = categoriesFollowed;
    }

    public List<UserActivation> getUserActivations() {
        return userActivations;
    }

    public void setUserActivations(List<UserActivation> userActivations) {
        this.userActivations = userActivations;
    }

    public List<UserLog> getUserLogs() {
        return userLogs;
    }

    public void setUserLogs(List<UserLog> userLogs) {
        this.userLogs = userLogs;
    }

    public List<UserSearch> getUserSearches() {
        return userSearches;
    }

    public void setUserSearches(List<UserSearch> userSearches) {
        this.userSearches = userSearches;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Interaction> getOffComments() {
        return offComments;
    }

    public void setOffComments(List<Interaction> offComments) {
        this.offComments = offComments;
    }

    public List<Interaction> getOffLikes() {
        return offLikes;
    }

    public void setOffLikes(List<Interaction> offLikes) {
        this.offLikes = offLikes;
    }

    public List<Interaction> getOffReports() {
        return offReports;
    }

    public void setOffReports(List<Interaction> offReports) {
        this.offReports = offReports;
    }

    public List<Interaction> getOffSeens() {
        return offSeens;
    }

    public void setOffSeens(List<Interaction> offSeens) {
        this.offSeens = offSeens;
    }

    public List<Interaction> getVoucherComments() {
        return voucherComments;
    }

    public void setVoucherComments(List<Interaction> voucherComments) {
        this.voucherComments = voucherComments;
    }

    public List<Interaction> getVoucherLikes() {
        return voucherLikes;
    }

    public void setVoucherLikes(List<Interaction> voucherLikes) {
        this.voucherLikes = voucherLikes;
    }

    public List<Interaction> getVoucherReports() {
        return voucherReports;
    }

    public void setVoucherReports(List<Interaction> voucherReports) {
        this.voucherReports = voucherReports;
    }

    public List<Interaction> getVoucherSeens() {
        return voucherSeens;
    }

    public void setVoucherSeens(List<Interaction> voucherSeens) {
        this.voucherSeens = voucherSeens;
    }

    public List<Interaction> getPostComments() {
        return PostComments;
    }

    public void setPostComments(List<Interaction> postComments) {
        PostComments = postComments;
    }

    public List<Interaction> getPostLikes() {
        return PostLikes;
    }

    public void setPostLikes(List<Interaction> postLikes) {
        PostLikes = postLikes;
    }

    public List<Interaction> getPostReports() {
        return PostReports;
    }

    public void setPostReports(List<Interaction> postReports) {
        PostReports = postReports;
    }

    public List<Interaction> getPostSeens() {
        return PostSeens;
    }

    public void setPostSeens(List<Interaction> postSeens) {
        PostSeens = postSeens;
    }
}
