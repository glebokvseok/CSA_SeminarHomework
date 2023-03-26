import java.util.List;

public class Consumer extends Worker implements Runnable {
    public Consumer(List<Byte> buffer, int bufferSize, int totalCount) {
        super(buffer, bufferSize, totalCount);
    }

    public void run() {
        while (currentCount < totalCount) {
            consume();
            sleep(30);
        }
    }

    private void consume() {
        synchronized (buffer) {
            if (buffer.isEmpty()) {
                try {
                    System.out.println("Buffer is empty. Waiting for consumer to write data buffer.");
                    buffer.wait();
                } catch (InterruptedException exception) {
                    System.out.println(exception.getMessage());
                }
            } else {
                while (!buffer.isEmpty()) {
                    int last = buffer.size() - 1;
                    System.out.printf("Read %d from buffer.\n", buffer.get(last));
                    ++currentCount;
                    buffer.remove(last);
                }

                buffer.notify();
            }
        }
    }
}
