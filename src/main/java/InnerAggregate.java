

public class InnerAggregate extends Aggregate implements InnerIterableCollection {
    @Override
    public void iteration(InnerIterator iterator) {
        for (int i : a) {
            iterator.operation(i);
        }
    }

}
