import java.util.List;
import java.util.Vector;

public class Catalog{
    String name;
    List<Document> docs;
    List<Catalog> cats;

    public Catalog(String name){
        this.name = name;
    }

    public boolean createDocument(Document doc) throws Exception{
        for (var document: docs){
            if(doc.getHeadline().equals(doc.getHeadline()))
                throw new Exception("");
        }
        return docs.add(doc);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDocuments(List<Document> docs) {
        this.docs = docs;
    }

    public void setFolders(List<Catalog> cats) {
        this.cats = cats;
    }

    public String getName() {
        return name;
    }

    public List<Document> getDocuments() {
        return docs;
    }

    public List<Catalog> getCatalogs() {
        return cats;
    }

    public boolean deleteDocument(Document doc){
        return docs.remove(doc);
    }
}