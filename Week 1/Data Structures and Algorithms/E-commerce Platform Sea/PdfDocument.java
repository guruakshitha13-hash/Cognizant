public class PdfDocument extends Document {
    public PdfDocument(String fileName) { super(fileName); }

    @Override public void open()  { System.out.println("[PDF] Opening : " + fileName); }
    @Override public void save()  { System.out.println("[PDF] Saving as .pdf : " + fileName); }
    @Override public void close() { System.out.println("[PDF] Closing : " + fileName); }
    @Override public String getDocumentType() { return "PDF Document (.pdf)"; }
}
