package institution.interlink;

import institution.Institution;
import institution.KnowledgeSource;
import institution.University;
import person.Student;

import java.util.ArrayList;

public class Internship extends Institution implements KnowledgeSource {
    ArrayList<Student> internshipList = new ArrayList<>();
    public Internship(String name, int factorOfPractice, int factorOfTheory) {
        super(name, factorOfPractice, factorOfTheory);
    }

    //the formation of a list of students depending on the average level of knowledge
    public void formListOfStudents(University university) {
        int average;
        int sum = 0;
        for (Student student : university.students) {
            sum = sum + student.knowledge.level;
        }
        average = sum / university.students.size();
        for (Student student : university.students) {
            if (student.knowledge.level >= average) {
                internshipList.add(student);
            }
        }
    }

    public void teach(Student student){
        if(internshipList.contains(student)){
            teachTheory(student);
            teachPractice(student);
        }
    }
}

