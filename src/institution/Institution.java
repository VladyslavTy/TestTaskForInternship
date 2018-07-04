package institution;

import person.Student;
import plan.PeriodOfDevelopment;
import plan.Schedule;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Institution {
    private String name;
    double factorOfPractice;
    double factorOfTheory;

    public ArrayList<Student> students = new ArrayList<>();

    public Institution(String name, double factorOfPractice, double factorOfTheory) {
        this.name = name;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void teachTheory(Student student){
        student.learnTheory(factorOfTheory);
    }

    public void teachPractice(Student student){
        student.learnPractice(factorOfPractice);
    }
}
