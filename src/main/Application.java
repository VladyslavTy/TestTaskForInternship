package main;

import institution.University;
import institution.interlink.Internship;
import institution.interlink.Meetup;
import person.Student;
import person.consciousness.Knowledge;
import plan.DevelopmentPlan;

public class Application {
    public static void main(String[] args) {
        Student firstStudent = new Student("Andrew Kostenko", 0.5, new Knowledge(20, 25));
        Student secondStudent = new Student("Julia Veselkina", 0.3, new Knowledge(10, 11));
        Student thirdStudent = new Student("Maria Perechrest", 1,new Knowledge(15, 17));
        Student otherStudent = new Student("Taras Shevchenko", 1,new Knowledge(32, 21));
        otherStudent.addLaptopAvailable();
        secondStudent.addLaptopAvailable();


        University university = new University("CHNU", 1, 2);
        university.addStudent(firstStudent);
        university.addStudent(secondStudent);
        university.addStudent(thirdStudent);


        Internship internship = new Internship("Interlink", 4, 3);
        internship.formListOfStudents(university);

        Meetup interlinkMeetup = new Meetup("Forming Async Mindset", 2,3);
        interlinkMeetup.addStudent(firstStudent);
        interlinkMeetup.addStudent(secondStudent);
        interlinkMeetup.addStudent(thirdStudent);
        interlinkMeetup.addStudent(otherStudent);

        DevelopmentPlan hardPlan = new DevelopmentPlan();
        hardPlan.addStudent(firstStudent);
        hardPlan.addStudent(otherStudent);



    }
}
