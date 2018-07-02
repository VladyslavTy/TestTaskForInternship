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
    public void givePracticalKnowledge() {
        super.givePracticalKnowledge();
        for (Student student : students
             ) {
                student.knowledge.levelOfPractic += student.learningFactor*1;
        }
    }

    @Override
    public void giveTheoryKnowledge() {
        super.giveTheoryKnowledge();
        for (Student student : students
                ) {
            student.knowledge.levelOfTheory += student.learningFactor*2;
        }
    }
}
