public abstract class DocumentBuilder {
        protected Document doc;

        public void createDocument() {
            doc = new Document();
        }

        public Document getDocument() {
            return doc;
        }
        
        public abstract void setExtension();
        public abstract void setEncryption();
    }
