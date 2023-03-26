import java.util.function.Predicate;

public class ArrayWorker {
    public int sum(int[] array, Predicate<Integer> predicate) {
        int sum = 0;
        for (var element : array) {
            if (predicate.test(element)) {
                sum += element;
            }
        }

        return sum;
    }

    public int count(int[] array, Predicate<Integer> predicate) {
        int cnt = 0;
        for (var element : array) {
            if (predicate.test(element)) {
                cnt += 1;
            }
        }

        return cnt;
    }
}
