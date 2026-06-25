public class FactoryMethodTest {
    public static void main(String[] args) {

        System.out.println("=== Document Management System ===");

        DocumentFactory wordFactory  = new WordDocumentFactory();
        DocumentFactory pdfFactory   = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        wordFactory.openDocument("ProjectReport");
        pdfFactory.openDocument("Invoice_2024");
        excelFactory.openDocument("SalesData_Q4");

        System.out.println("\nAll documents created successfully!");
    }
}
