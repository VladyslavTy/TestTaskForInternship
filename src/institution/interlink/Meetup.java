package institution.interlink;

import institution.Institution;
import institution.KnowledgeSource;
import person.Student;

import java.util.ArrayList;

public class Meetup extends Institution implements KnowledgeSource {

    boolean isInteractive = false;
    public Meetup(String name, double factorOfPractice, double factorOfTheory) {
        super(name, factorOfPractice, factorOfTheory);
    }

    public void establishInteractivity(){
        this.isInteractive = true;
    }

    public void teach(Student student){
        if(isInteractive){
            this.factorOfTheory += 0.5;
        }
        teachTheory(student);
        if(student.laptopAvailable)
            teachPractice(student);
    }
}
