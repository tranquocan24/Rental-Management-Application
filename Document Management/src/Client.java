import javax.print.Doc;

public class Client {
    private DocumentBuilder builder;

    public void setBuilder(DocumentBuilder builder) {
        this.builder = builder;
    }

    public Document constructDocument() {
        builder.createDocument();
        builder.setExtension();
        builder.setEncryption();
        return builder.getDocument();
    }

    public static void main(String[] args) {
        Client client = new Client();

        DocumentBuilder normalDocumentBuilder = new NormalDoc();
        client.setBuilder(normalDocumentBuilder);
        Document normalDoc = client.constructDocument();
        System.out.println("Normal Document: ");
        normalDoc.showDocument();

        DocumentBuilder confidentDocumentBuilder = new ConfidentDoc();
        client.setBuilder(confidentDocumentBuilder);
        Document confidentDoc = client.constructDocument();
        System.out.println("\nConfident Document: ");
        confidentDoc.showDocument();
    }
}
