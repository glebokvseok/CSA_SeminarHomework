import java.util.ArrayList;
import java.util.List;

public class GamePublisher {
    public GamePublisher() {
        subscribers = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publishGame() {
        var game = createGame();
        for (var subscriber : subscribers) {
            subscriber.onGameReleased(game);
        }
    }

    private final List<Subscriber> subscribers;

    private Game createGame() {
        return new Game("Mario cart 11",
                "version=11.0.0;os=linux;",
                "Super cool new game about plumber and his brother",
                new String[]{"Defeat bowser", "Save princess"});
    }
}
