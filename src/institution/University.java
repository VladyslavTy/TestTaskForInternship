package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class University extends SourseOfKnowledge{
    String universityName;
    Student student;
    public ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.universityName = name;
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
        student.knowledge.levelOfPractic += student.learningFactor*1;

    }

    @Override
    public void giveTheoryKnowledge(Student student) {
        super.giveTheoryKnowledge(student);
        student.knowledge.levelOfTheory += student.learningFactor*2;
    }
}
