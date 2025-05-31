public abstract class RequestCreator {
    public abstract requestProduct createRequest();

    public void processRequest() {
        requestProduct request = createRequest();
        request.processRequest();
    }
    public static void main(String[] args) {
        RequestCreator low = new lowPriorityConcreteCreator();
        RequestCreator mid  = new midPriorityConcreteCreator();
        RequestCreator high = new highPriorityConcreteCreator();

        low.processRequest();
        mid.processRequest();
        high.processRequest();
    }
}
