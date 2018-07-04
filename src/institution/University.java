package institution;

import person.Student;

public class University extends Institution implements KnowledgeSource{


    public University(String name, int factorOfPractice, int factorOfTheory){
        super(name,factorOfPractice,factorOfTheory);
    }

    public void teach(Student student){
        if(students.contains(student)){
            teachTheory(student);
            teachPractice(student);
        }
    }
}
