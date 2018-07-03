package institution.interlink;

import institution.Institution;
import institution.KnowledgeSource;
import person.Student;

import java.util.ArrayList;

public class Meetup extends Institution implements KnowledgeSource {

    public Meetup(String name, int factorOfPractice, int factorOfTheory) {
        super(name, factorOfPractice, factorOfTheory);
    }

    public void teach(Student student){
        teachTheory(student);
        if(student.laptop)
            teachPractice(student);
    }
}
