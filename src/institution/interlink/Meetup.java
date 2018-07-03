package institution.interlink;

import institution.KnowledgeSource;
import person.Student;

import java.util.ArrayList;

public class Meetup implements KnowledgeSource {
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
        teachTheory(student);
        if(student.laptop)
            teachPractice(student);
    }

    private void teachTheory(Student student){
        student.learnTheory(factorOfTheory);
    }

    private void teachPractice(Student student){
        student.learnPractice(factorOfPractice);
    }

}
