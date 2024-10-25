public class IntIterator implements OuterIterator {
    private int pos = -1;
    private OuterAggregate owner;

    public void setOwner(OuterAggregate owner) {
        this.owner = owner;
    }

    @Override
    public void reset() {
        pos = -1;
    }

    @Override
    public boolean hasNext() {
        return pos < owner.a.length - 1;
    }

    @Override
    public void next() {
        pos++;
    }

    @Override
    public int getContent() {
        return owner.a[pos];
    }
}
