public class Developer implements Subscriber {
    public void onGameReleased(Game game) {
        System.out.printf("Technical data:\n%s\n", game.getTechnicalData());
    }
}
