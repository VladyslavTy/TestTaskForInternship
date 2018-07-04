package person;

import institution.KnowledgeSource;
import person.consciousness.Knowledge;

public class Student implements KnowledgeSource {
    public String name;
    public Knowledge knowledge;
    public double learningFactor;
    public boolean laptopAvailable = false;

    public Student(String name, double learningFactor, Knowledge knowledge) {
        this.name = name;
        this.learningFactor = learningFactor;
        this.knowledge = knowledge;
    }

    public void addLaptopAvailable(){
        this.laptopAvailable = true;
    }

    public void learnTheory(double theoryKnowledge){
        this.knowledge.levelOfTheory += theoryKnowledge*this.learningFactor;
    }

    public void learnPractice(double practiceKnowledge){
        this.knowledge.levelOfPractice += practiceKnowledge*this.learningFactor;
    }

    private void teachTheory(Student student){
        student.learnTheory(this.knowledge.levelOfTheory);
    }

    private void teachPractice(Student student){
        student.learnPractice(this.knowledge.levelOfPractice);
    }

    public void teach(Student student){
        if(this.knowledge.levelOfTheory > student.knowledge.levelOfTheory){
            teachTheory(student);
        }
        if(this.knowledge.levelOfPractice > student.knowledge.levelOfPractice){
            teachPractice(student);
        }
    }
}
