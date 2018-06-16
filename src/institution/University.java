package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.Random;

public class University {
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
}
