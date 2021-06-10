import java.util.List;

public class Catalog{
    private String name;
    List<Document> docs;
    List<Catalog> cats;

    public Catalog(String name){
        this.name = name;
    }

    public boolean createDocument(Document doc){
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