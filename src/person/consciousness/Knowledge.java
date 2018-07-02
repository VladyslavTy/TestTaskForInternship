package person.consciousness;

public class Knowledge {
    public int level;
    public int levelOfPractice;
    public int levelOfTheory;
    public Knowledge(int levelOfPractice, int levelOfTheory) {
        this.levelOfTheory = levelOfTheory;
        this.levelOfPractice = levelOfPractice;
        this.level = levelOfPractice + levelOfTheory;
    }
}
