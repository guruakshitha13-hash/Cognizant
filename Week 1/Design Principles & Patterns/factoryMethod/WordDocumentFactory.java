public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String fileName) {
        System.out.println("WordFactory: Creating Word document...");
        return new WordDocument(fileName);
    }
}
