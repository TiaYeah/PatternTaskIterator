package abstractClasses;

import java.util.Arrays;
import java.util.Random;

public abstract class Aggregate {
    protected int[] a;

    public Aggregate(int[] a) {
        this.a = a;
    }

    public void fillArray(int n) {
        a = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
        }
    }

    public int[] getA() {
        return a;
    }

    @Override
    public String toString() {
        return "abstractClasses.Aggregate{" +
                "a=" + Arrays.toString(a) +
                '}';
    }
}
