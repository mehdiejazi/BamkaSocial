package ir.bamka.social.model.to;

public class Content {
    private int id;
    private String content = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        if (content.isEmpty())
            content = "";
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
