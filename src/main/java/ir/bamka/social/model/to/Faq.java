package ir.bamka.social.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_faqs")
public class Faq {

    @Id
    @GeneratedValue
    private Long Id;
    private String faq;
    private String faqAns;
    private boolean faqPublish;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public String getFaqAns() {
        return faqAns;
    }

    public void setFaqAns(String faqAns) {
        this.faqAns = faqAns;
    }

    public boolean getFaqPublish() {
        return faqPublish;
    }

    public void setFaqPublish(boolean faqPublish) {

        this.faqPublish = faqPublish;
    }
}
