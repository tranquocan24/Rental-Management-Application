public class NormalDoc extends DocumentBuilder {

    @Override
    public void setEncryption() {
        doc.setEncryption(" none");
    }

    @Override
    public void setExtension() {
        doc.setExtension(".txt");
    }
}
