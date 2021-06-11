public class Administrator implements AdministratorController{
    @Override
    public synchronized boolean deleteDoc(Catalog cats, Document docs) {
        return cats.deleteDocument(docs);
    }

    @Override
    public synchronized Catalog createCatalog(String name) {
        return new Catalog(name);
    }

    @Override
    public synchronized boolean moveCatalog(Catalog fromCatalog, Catalog toCatalog, Document doc) {
        fromCatalog.deleteDocument(doc);
        try{
            return toCatalog.createDocument(doc);
        } catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}
interface AdministratorController{
    boolean deleteDoc(Catalog cats, Document docs);
    Catalog createCatalog(String name);
    boolean moveCatalog(Catalog fromCatalog, Catalog toCatalog, Document doc);
}