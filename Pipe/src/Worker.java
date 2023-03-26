import java.util.List;
import java.util.Random;

public abstract class Worker {
    public Worker(List<Byte> buffer, int bufferSize, int totalCount) {
        this.bufferSize = bufferSize;
        this.buffer = buffer;
        this.totalCount = totalCount;
        currentCount = 0;
        random = new Random();
    }

    protected void sleep(long delay) {
        try {
            Thread.sleep(delay * random.nextLong(1, 11));
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }

    protected final int bufferSize;
    protected final int totalCount;
    protected final List<Byte> buffer;
    protected final Random random;
    protected int currentCount;
}
