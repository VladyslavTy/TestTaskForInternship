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

    public void teach(Student student){
        if(student.laptop)
            student.learn(factorOfTheory,factorOfPractice);
        else
            student.learn(factorOfTheory,0);


    }

}
