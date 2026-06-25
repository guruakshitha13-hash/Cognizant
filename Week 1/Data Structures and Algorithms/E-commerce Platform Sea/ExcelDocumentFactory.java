public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String fileName) {
        System.out.println("ExcelFactory: Creating Excel document...");
        return new ExcelDocument(fileName);
    }
}
