public class midPriorityConcreteCreator extends RequestCreator{

    @Override
    public requestProduct createRequest() {
        return new midPriorityConcrete();
    }
    
}
