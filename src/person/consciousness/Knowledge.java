package person.consciousness;

public class Knowledge {
    public int level;
    public int levelOfPractic;
    public int levelOfTheory;
    public Knowledge(int levelOfPractic, int levelOfTheory) {
        this.levelOfTheory = levelOfTheory;
        this.levelOfPractic = levelOfPractic;
        this.level = levelOfPractic + levelOfTheory;
    }
}
