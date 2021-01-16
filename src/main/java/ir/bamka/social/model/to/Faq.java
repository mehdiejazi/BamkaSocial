package ir.bamka.social.model.to;

public class Faq {
    private int faqid;
    private String faq;
    private String faqAns;
    private int faqPublish = 0;

    public int getFaqid() {
        return faqid;
    }

    public void setFaqid(int faqid) {
        this.faqid = faqid;
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

    public int getFaqPublish() {
        return faqPublish;
    }

    public void setFaqPublish(int faqPublish) {

        this.faqPublish = faqPublish;
    }
}
