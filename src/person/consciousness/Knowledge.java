package person.consciousness;

public class Knowledge {
    public int levelOfTheory;
    public int levelOfPractical;
    public int level;

    public Knowledge(int levelT, int levelP) {
        this.levelOfTheory = levelT;
        this.levelOfPractical = levelP;
        this.level = levelOfPractical + levelOfTheory;
    }
}
