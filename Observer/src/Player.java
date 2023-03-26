public class Player implements Subscriber {
    public void onGameReleased(Game game) {
        System.out.printf("Name:\n%s\n", game.getName());
        System.out.println("Achievements:");
        for (var achievement : game.getAchievements()) {
            System.out.println(achievement);
        }
    }
}
