public abstract class Document {
    protected String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
    public abstract String getDocumentType();

    public void printInfo() {
        System.out.println("Type : " + getDocumentType());
        System.out.println("File : " + fileName);
    }
}
