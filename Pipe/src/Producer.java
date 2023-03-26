import java.util.List;

public class Producer extends Worker implements Runnable {
    public Producer(List<Byte> buffer, int bufferSize, int totalCount) {
        super(buffer, bufferSize, totalCount);
    }

    public void run() {
        while (currentCount < totalCount) {
            produce();
            sleep(10);
        }
    }

    private void produce() {
        synchronized (buffer) {
            Byte number = (byte) random.nextInt(-128, 128);
            if (buffer.size() == bufferSize) {
                try {
                    System.out.println("Buffer is full. Waiting for consumer to read data from buffer.");
                    buffer.wait();
                } catch (InterruptedException exception) {
                    System.out.println(exception.getMessage());
                }
            } else {
                buffer.add(number);
                ++currentCount;
                System.out.printf("Added %d to buffer.\n", number);
                buffer.notify();
            }
        }
    }
}
