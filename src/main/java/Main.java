import Inner.InnerAggregate;
import Inner.InnerIterator;
import Inner.Sum;
import Outer.OuterAggregate;
import Outer.OuterIterator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }


        InnerAggregate i = new InnerAggregate(arr);
        Sum sum = new Sum();
        System.out.println(i);

        i.iteration(sum);
        System.out.println(sum.getSum());

        OuterAggregate o = new OuterAggregate(arr);
        System.out.println(o);

        OuterIterator iterator = o.createIterator();
        iterator.setOwner(o);

        int sumByIterator = 0;
        while (iterator.hasNext()) {
            iterator.next();
            sumByIterator += iterator.getContent();
        }

        System.out.println(sumByIterator);

        int[] delegateSum = {0};
        i.iteration((a) -> delegateSum[0] += a);
        System.out.println(delegateSum[0]);
    }
}
