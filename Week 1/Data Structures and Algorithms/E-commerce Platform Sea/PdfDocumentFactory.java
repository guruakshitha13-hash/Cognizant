public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String fileName) {
        System.out.println("PdfFactory: Creating PDF document...");
        return new PdfDocument(fileName);
    }
}
