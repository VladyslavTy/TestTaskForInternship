package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"), new Knowledge(100));
        university.addStudent(new Student("Julia Veselkina"), new Knowledge(70));
        university.addStudent(new Student("Maria Perechrest"), new Knowledge(32));

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        internship.getStudents(university);
    }
}
