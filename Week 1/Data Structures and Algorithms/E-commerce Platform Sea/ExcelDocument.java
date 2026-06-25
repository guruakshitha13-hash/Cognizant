public class ExcelDocument extends Document {
    public ExcelDocument(String fileName) { super(fileName); }

    @Override public void open()  { System.out.println("[Excel] Opening : " + fileName); }
    @Override public void save()  { System.out.println("[Excel] Saving as .xlsx : " + fileName); }
    @Override public void close() { System.out.println("[Excel] Closing : " + fileName); }
    @Override public String getDocumentType() { return "Microsoft Excel (.xlsx)"; }
}
