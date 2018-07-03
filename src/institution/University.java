package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class University implements KnowledgeSource{
    String universityName;
    Student student;
    int factorOfPractice;
    int factorOfTheory;

    public ArrayList<Student> students = new ArrayList<>();

    public University(String name, int factorOfPractice, int factorOfTheory) {
        this.universityName = name;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    public void setStudent(Student student) {
        this.student = student;

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void teach(Student student){
        if(students.contains(student)){
            teachTheory(student);
            teachPractice(student);
        }
    }

    private void teachTheory(Student student){
       student.learnTheory(factorOfTheory);
    }

    private void teachPractice(Student student){
        student.learnPractice(factorOfPractice);
    }
}
