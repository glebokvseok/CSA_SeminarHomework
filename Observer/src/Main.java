public class Main {
    public static void main(String[] args) {
        var player = new Player();
        var developer = new Developer();
        var journalist = new Journalist();
        var gamePublisher = new GamePublisher();

        gamePublisher.addSubscriber(player);
        gamePublisher.addSubscriber(developer);
        gamePublisher.addSubscriber(journalist);

        gamePublisher.publishGame();
    }
}