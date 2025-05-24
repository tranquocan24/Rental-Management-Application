public class ConfidentDoc extends DocumentBuilder {

    @Override
    public void setEncryption() {
        doc.setEncryption("AES");
    }

    @Override
    public void setExtension() {
        doc.setExtension(".zip");
    }

}
