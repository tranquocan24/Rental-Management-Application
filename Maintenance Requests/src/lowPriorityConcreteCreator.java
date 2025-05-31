public class lowPriorityConcreteCreator extends RequestCreator {

    @Override
    public requestProduct createRequest() {
        return new lowPriorityConcrete();
    }

}
