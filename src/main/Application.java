package main;

import institution.University;
import institution.interlink.Internship;
import institution.interlink.Meetup;
import person.SelfStudy;
import person.Student;
import person.consciousness.Knowledge;
import plan.DevelopmentPlan;
import plan.PeriodOfDevelopment;
import plan.conditions.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Application {
    public static void main(String[] args) {
        Student firstStudent = new Student("Andrew Kostenko", 0.5, new Knowledge(20, 25));
        Student secondStudent = new Student("Julia Veselkina", 0.3, new Knowledge(10, 11));
        Student thirdStudent = new Student("Maria Perechrest", 1,new Knowledge(15, 17));
        Student otherStudent = new Student("Taras Shevchenko", 1,new Knowledge(32, 21));
        otherStudent.addLaptopAvailable();
        secondStudent.addLaptopAvailable();

        University university = new University("CHNU", 1, 2);
        CompositeCondition universityCondition = new CompositeCondition();
        universityCondition.add(new WorkDayCondition());
        universityCondition.add(new SummerCondition());
        universityCondition.add(new YearCondition(2018,2019));
        university.addStudent(firstStudent);
        university.addStudent(secondStudent);
        university.addStudent(thirdStudent);

        Internship internship = new Internship("Interlink", 4, 3);
        internship.formListOfStudents(university);
        LocalDate startInternship = LocalDate.of(2018,Month.JULY,2);
        LocalDate finishInternship = LocalDate.of(2018,Month.SEPTEMBER,27);
        CompositeCondition internshipCondition = new CompositeCondition();
        internshipCondition.add(new TimePeriodCondition(startInternship,finishInternship));
        internshipCondition.add(new WorkDayCondition());
        internship.addStudent(otherStudent);

        Meetup interlinkMeetup = new Meetup("Forming Async Mindset", 2,3);
        LocalDate meetupDate = LocalDate.of(2018,Month.JULY,12);
        OneDayCondition oneDayMeetupCondition = new OneDayCondition(meetupDate);
        interlinkMeetup.addStudent(firstStudent);
        interlinkMeetup.addStudent(secondStudent);
        interlinkMeetup.addStudent(thirdStudent);
        interlinkMeetup.addStudent(otherStudent);

        SelfStudy selfStudy = new SelfStudy();

        DevelopmentPlan hardPlan = new DevelopmentPlan();
        hardPlan.addPlanEvent(university, universityCondition);
        hardPlan.addPlanEvent(internship,internshipCondition);
        hardPlan.addPlanEvent(selfStudy,new WeekendCondition());
        hardPlan.addPlanEvent(interlinkMeetup,oneDayMeetupCondition);
        hardPlan.addStudent(firstStudent);
        hardPlan.addStudent(thirdStudent);
        hardPlan.addStudent(otherStudent);

        LocalDate startPlan = LocalDate.of(2018, Month.JUNE, 29);
        LocalDate finishPlan = LocalDate.of(2018, Month.DECEMBER, 20);
        Period periodOfPlan = Period.between(startPlan,finishPlan);
        for(int i = 0; i <= periodOfPlan.getDays(); i++){
            hardPlan.apply();
        }



    }
}
