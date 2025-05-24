public class Document {
    private String extension;
    private String encryption;

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public void showDocument() {
        System.out.println("Extension" + extension);
        System.out.println("Encryption" + encryption);
    }
}
