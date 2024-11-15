package Outer;

import abstractClasses.Aggregate;

public class OuterAggregate extends Aggregate implements OuterIterableCollection {
    public OuterAggregate(int[] a) {
        super(a);
    }

    @Override
    public OuterIterator createIterator() {
        return new IntIterator();
    }
}
