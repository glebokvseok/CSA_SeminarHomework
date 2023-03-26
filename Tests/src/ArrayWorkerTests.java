import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayWorkerTests {
    @BeforeEach
    void setupCurrent(){
        arrayWorker = new ArrayWorker();
    }

    @Test
    void testSum() {
        var array = new int[] { 1, 2, 3, 4, 5 };
        Assertions.assertEquals(15, arrayWorker.sum(array, (element) -> true));
    }

    @Test
    void testSumGreater() {
        var array = new int[] { 4, 2, 7, 4, 5, 3 };
        Assertions.assertEquals(20, arrayWorker.sum(array, (element) -> element > 3));
    }

    @Test
    void testNullReferenceException() {
        int[] array = null;
        Assertions.assertThrows(NullPointerException.class, () -> arrayWorker.sum(array, (element) -> true));
    }

    @Test
    void testCountOdd() {
        var array = new int[] { 3, 7, 1, 8, 2 };
        Assertions.assertEquals(3, arrayWorker.count(array, (element) -> element % 2 == 1));
    }

    @Test
    void testCountEven() {
        var array = new int[] { 1, 2, 2, 4, 6, 9 };
        Assertions.assertEquals(4,arrayWorker.count(array, (element) -> element % 2 == 0));
    }

    private ArrayWorker arrayWorker;
}
