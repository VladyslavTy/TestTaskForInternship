package institution.interlink;

import institution.University;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.Arrays;

public class Internship {
    String name;
    Student student;
    ArrayList<Student> internshipList = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void getStudents(University university) {
        formListOfStudents(university);
        for (Student student: internshipList) {
            System.out.println(student.name);
        }
    }

    //the formation of a list of students depending on the average level of knowledge
    private void formListOfStudents(University university){
        int average;
        int sum = 0;
        for (Student student: university.students) {
        sum = sum + student.knowledge.level;
        }
        average = sum / university.students.size();
        for (Student student: university.students) {
            if(student.knowledge.level >= average){
                internshipList.add(student);
            }
        }
    }
}
