public class OuterAggregate extends Aggregate implements  OuterIterableCollection {
    @Override
    public OuterIterator createIterator() {
        return new IntIterator();
    }
}
