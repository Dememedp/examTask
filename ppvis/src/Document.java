import java.util.Date;

public class Document{
    private String headline;
    private Date createDate;
    private String author;
    private String text;

    public Document(Catalog cat, String headline, Date createDate, String author,
             String text){
        cat.createDocument(this);
        this.headline = headline;
        this.createDate = createDate;
        this.author = author;
        this.text = text;
    }

    public Document(Catalog cat, String headline, String author){
        cat.createDocument(this);
        this.headline = headline;
        this.author = author;
    }

    public String getHeadline() {
        return headline;
    }

    public Date getDate() {
        return createDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setHeadline(String newHeadline){
        this.headline = newHeadline;
    }

    public void setText(String newText){
        this.text = newText;
    }

    public void setCreateData(Date createData) {
        this.createDate = createData;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}