package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class University extends SourseOfKnowledge{
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

    public void addStudent(Student student, Knowledge knowledge) {
        student.setKnowledge(knowledge);
        students.add(student);
    }

    @Override
    public void givePracticalKnowledge(Student student) {
        super.givePracticalKnowledge(student);
        student.knowledge.levelOfPractice += student.learningFactor*factorOfPractice;

    }

    @Override
    public void giveTheoryKnowledge(Student student) {
        super.giveTheoryKnowledge(student);
        student.knowledge.levelOfTheory += student.learningFactor*factorOfTheory;
    }
}
