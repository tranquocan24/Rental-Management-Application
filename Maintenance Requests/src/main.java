public class main {
    public static void main(String[] args) {
        RequestCreator low = new lowPriorityConcreteCreator();
        requestProduct lowRequest = low.createRequest();
        System.out.println(lowRequest);
        low.processRequest();
    }
}
