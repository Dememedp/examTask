import javax.print.Doc;
import javax.xml.crypto.Data;
import java.util.Date;

public class Writer implements WriterController{
    private final String authorName;

    public Writer(String authorName){
        this.authorName = authorName;
    }

    @Override
    public synchronized Document createDoc(Catalog cat, String headline, String text){
        Document doc = null;
        try{
            doc = new Document(cat, headline, text);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        doc.setAuthor(authorName);
        doc.setCreateData(new Date());
        return doc;
    }

    @Override
    public synchronized void updateHeadline(Document doc, String headline) {
        doc.setHeadline(headline);
    }

    @Override
    public synchronized void updateText(Document doc, String text) {
        doc.setText(text);
    }
}
interface WriterController{
    Document createDoc(Catalog cat, String headline, String text);
    void updateHeadline(Document doc, String headline);
    void updateText(Document doc, String text);
}