public abstract class DocumentFactory {
    public abstract Document createDocument(String fileName);

    public void openDocument(String fileName) {
        System.out.println("\n=============================");
        Document doc = createDocument(fileName);
        doc.printInfo();
        doc.open();
        doc.save();
        doc.close();
        System.out.println("=============================");
    }
}
