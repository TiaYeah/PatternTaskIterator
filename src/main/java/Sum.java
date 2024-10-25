public class Sum implements InnerIterator {
    private int sum = 0;

    @Override
    public void operation(int item) {
        sum += item;
    }

    public int getSum() {
        return sum;
    }
}
