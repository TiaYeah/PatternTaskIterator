import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InnerAggregate a =  new InnerAggregate();
        Sum sum = new Sum();
        a.fillArray(10);
        System.out.println(a);

        a.iteration(sum);
        System.out.println(sum.getSum());

        OuterAggregate o = new OuterAggregate();
        o.fillArray(10);
        System.out.println(o);

        OuterIterator iterator = o.createIterator();
        iterator.setOwner(o);

        while (iterator.hasNext()) {
            iterator.next();
            System.out.println(iterator.getContent());
        }
    }
}
