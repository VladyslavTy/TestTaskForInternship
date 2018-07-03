package person;

import institution.KnowledgeSource;
import person.consciousness.Knowledge;

public class Student implements KnowledgeSource {
    public String name;
    public Knowledge knowledge;
    public double learningFactor;
    public boolean laptop = false;

    public Student(String name, double learningFactor) {
        this.name = name;
        this.learningFactor = learningFactor;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public void addLaptop(){
        this.laptop = true;
    }

    public void learn(int theoryKnowledge, int practiceKnowledge){
        this.knowledge.levelOfTheory += theoryKnowledge*this.learningFactor;
        this.knowledge.levelOfPractice += practiceKnowledge*this.learningFactor;
    }

    public void teach(Student student){
        if(this.knowledge.level > student.knowledge.level){
            student.learn(this.knowledge.levelOfTheory, this.knowledge.levelOfPractice);
        }
    }

}
