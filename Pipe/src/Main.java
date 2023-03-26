import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int bufferSize = 2;
        final int numbersCount = 10;

        var buffer = new ArrayList<Byte>();
        var producer = new Thread(new Producer(buffer, bufferSize, numbersCount));
        var consumer = new Thread(new Consumer(buffer, bufferSize, numbersCount));

        producer.start();
        consumer.start();
    }
}