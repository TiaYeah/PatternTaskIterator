package Inner;

import abstractClasses.Aggregate;

public class InnerAggregate extends Aggregate implements InnerIterableCollection {
    public InnerAggregate(int[] a) {
        super(a);
    }

    @Override
    public void iteration(InnerIterator iterator) {
        for (int i : a) {
            iterator.operation(i);
        }
    }

}
