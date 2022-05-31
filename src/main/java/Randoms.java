import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int minValue;
    protected int maxValue;

    public Randoms(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int result = random.nextInt(maxValue - minValue + 1);
                result += minValue;
                return result;
            }
        };
    }
}
