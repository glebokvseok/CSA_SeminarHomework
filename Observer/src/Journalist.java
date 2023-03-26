public class Journalist implements Subscriber {
    public void onGameReleased(Game game) {
        System.out.printf("Description: \n%s\n", game.getDescription());
    }
}
