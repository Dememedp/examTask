public class Secretary implements SecretaryController{
    @Override
    public boolean addDoc(Catalog cat, Document doc) {
        return cat.createDocument(doc);
    }

    @Override
    public Document searchAuthor(Catalog cat, String author) {
        for (var doc : cat.getDocuments()) {
            if(doc.getAuthor().equals(author));
            return doc;
        }
        return null;
    }

    @Override
    public Document searchHeadline(Catalog cat, String headline) {
        for (var doc : cat.getDocuments()) {
            if(doc.getHeadline().equals(headline));
            return doc;
        }
        return null;
    }
}
interface SecretaryController{
    boolean addDoc(Catalog cat, Document doc);
    Document searchAuthor(Catalog cat, String author);
    Document searchHeadline(Catalog cat, String headline);
}