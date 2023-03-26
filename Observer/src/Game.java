public class Game {
    public Game(String name, String technicalData, String description, String[] achievements) {
        this.name = name;
        this.technicalData = technicalData;
        this.description = description;
        this.achievements = achievements;
    }

    public String getName() {
        return name;
    }

    public String getTechnicalData() {
        return technicalData;
    }

    public String getDescription() {
        return description;
    }

    public String[] getAchievements() {
        return achievements;
    }

    private final String name;
    private final String technicalData;
    private final String description;

    private final String[] achievements;
}
