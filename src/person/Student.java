package person;

import person.consciousness.Knowledge;

public class Student {
    public String name;
    public Knowledge knowledge;
    public double learningFactor;


    public Student(String name, double learningFactor) {
        this.name = name;
        this.learningFactor = learningFactor;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }




}
