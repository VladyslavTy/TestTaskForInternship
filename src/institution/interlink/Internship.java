package institution.interlink;

import institution.SourseOfKnowledge;
import institution.University;
import person.Student;

import java.util.ArrayList;

public class Internship extends SourseOfKnowledge {
    String name;
    Student student;
    int factorOfPractice;
    int factorOfTheory;
    ArrayList<Student> internshipList = new ArrayList<>();

    public Internship(String name, int factorOfPractice, int factorOfTheory) {
        this.name = name;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void getStudents(University university) {
        formListOfStudents(university);
        for (Student student : internshipList) {
            System.out.println(student.name);
        }
    }

    //the formation of a list of students depending on the average level of knowledge
    private void formListOfStudents(University university) {
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

    @Override
    public void givePracticalKnowledge(Student student) {

            student.knowledge.levelOfPractice += student.learningFactor*factorOfPractice;

    }

    @Override
    public void giveTheoryKnowledge(Student student) {
        super.giveTheoryKnowledge(student);
            student.knowledge.levelOfTheory += student.learningFactor*factorOfTheory;

    }
}
