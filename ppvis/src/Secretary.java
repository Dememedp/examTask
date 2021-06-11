public class Secretary implements SecretaryController{
    @Override
    public synchronized boolean addDoc(Catalog cat, Document doc) {
        try{
            return cat.createDocument(doc);
        } catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public synchronized Document searchAuthor(Catalog cat, String author) {
        for (var doc : cat.getDocuments()) {
            if(doc.getAuthor().equals(author));
                return doc;
        }
        return null;
    }

    @Override
    public synchronized Document searchHeadline(Catalog cat, String headline) {
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