public abstract class RequestCreator {
    public abstract requestProduct createRequest();

    public void processRequest() {
        requestProduct request = createRequest();
        request.processRequest();
    }
}
