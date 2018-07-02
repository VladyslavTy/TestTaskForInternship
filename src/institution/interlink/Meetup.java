package institution.interlink;

import institution.SourseOfKnowledge;
import person.Student;

import java.util.ArrayList;

public class Meetup extends SourseOfKnowledge {
    String name;
    int factorOfPractice;
    int factorOfTheory;
    public ArrayList<Student> meetupList = new ArrayList<>();

    public Meetup(String name, int factorOfPractice, int factorOfTheory) {
        this.name = name;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    @Override
    public void givePracticalKnowledge(Student student) {
        super.givePracticalKnowledge(student);
        if(student.laptop){
            student.knowledge.levelOfPractice += student.learningFactor*factorOfPractice;
        }
        else
            student.knowledge.levelOfPractice += student.learningFactor*0;
    }

    @Override
    public void giveTheoryKnowledge(Student student) {
        super.giveTheoryKnowledge(student);
        student.knowledge.levelOfTheory += student.learningFactor*factorOfTheory;

    }
}
