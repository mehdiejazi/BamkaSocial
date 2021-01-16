package ir.bamka.social.model.to;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private int catid;
    private String catName = "";


    public Category() {
        catid = -1;
    }

    public Category(int catID, String catName) {
        this.catid = catID;
        this.catName = catName;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
