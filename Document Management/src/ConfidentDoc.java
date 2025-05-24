public class ConfidentDoc extends DocumentBuilder {

    @Override
    public void setEncryption() {
        doc.setEncryption("ABD-2099#@$");
    }

    @Override
    public void setExtension() {
        doc.setExtension(".enc");
    }

}
