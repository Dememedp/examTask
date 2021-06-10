import javax.print.Doc;
import javax.xml.crypto.Data;
import java.util.Date;

public class Writer implements WriterController{
    private String authorName;

    Writer(String authorName){
        this.authorName = authorName;
    }

    public Document createDoc(Catalog cat, String headline, String text){
        Document doc = null;
        doc = new Document(cat, headline, text);
        doc.setAuthor(authorName);
        doc.setCreateData(new Date());
        return doc;
    }

    @Override
    public void updateHeadline(Document doc, String headline) {
        doc.setHeadline(headline);
    }

    @Override
    public void updateText(Document doc, String text) {
        doc.setText(text);
    }
}
interface WriterController{
    Document createDoc(Catalog cat, String headline, String text);
    void updateHeadline(Document doc, String headline);
    void updateText(Document doc, String text);
}