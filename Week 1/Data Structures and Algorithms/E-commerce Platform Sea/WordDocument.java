public class WordDocument extends Document {
    public WordDocument(String fileName) { super(fileName); }

    @Override public void open()  { System.out.println("[Word] Opening : " + fileName); }
    @Override public void save()  { System.out.println("[Word] Saving as .docx : " + fileName); }
    @Override public void close() { System.out.println("[Word] Closing : " + fileName); }
    @Override public String getDocumentType() { return "Microsoft Word (.docx)"; }
}
