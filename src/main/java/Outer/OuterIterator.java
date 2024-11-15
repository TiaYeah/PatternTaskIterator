package Outer;

public interface OuterIterator {
    void reset();
    boolean hasNext();
    void next();
    int getContent();
    void setOwner(OuterAggregate owner);
}
