package person.consciousness;

public class Knowledge {
    public double level;
    public double levelOfPractice;
    public double levelOfTheory;
    public Knowledge(int levelOfPractice, int levelOfTheory) {
        this.levelOfTheory = levelOfTheory;
        this.levelOfPractice = levelOfPractice;
        this.level = levelOfPractice + levelOfTheory;
    }
}
