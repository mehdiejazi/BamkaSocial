package ir.bamka.social.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user_activations")
public class UserActivation {

    @Id
    @GeneratedValue
    private Long Id;
    private String code;
    private String genDate;
    private String expDate;
    private boolean disabled;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
