public class Administrator implements AdministratorController{
    @Override
    public boolean deleteDoc(Catalog cats, Document docs) {
        return cats.deleteDocument(docs);
    }

    @Override
    public Catalog createCatalog(String name) {
        return new Catalog(name);
    }

    @Override
    public boolean moveCatalog(Catalog fromCatalog, Catalog toCatalog, Document doc) {
        fromCatalog.deleteDocument(doc);
        return toCatalog.createDocument(doc);
    }
}
interface AdministratorController{
    boolean deleteDoc(Catalog cats, Document docs);
    Catalog createCatalog(String name);
    boolean moveCatalog(Catalog fromCatalog, Catalog toCatalog, Document doc);
}