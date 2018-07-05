package main;

import institution.University;
import institution.interlink.Internship;
import institution.interlink.Meetup;
import person.SelfStudy;
import person.Student;
import person.consciousness.Knowledge;
import plan.DevelopmentPlan;
import plan.conditions.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {
    public static void main(String[] args) {
        Student firstStudent = new Student("Andrew Kostenko", 0.6, new Knowledge(10, 25));
        Student secondStudent = new Student("Julia Veselkina", 0.4, new Knowledge(10, 11));
        Student thirdStudent = new Student("Maria Perechrest", 1,new Knowledge(15, 17));
        Student otherStudent = new Student("Taras Shevchenko", 0.1,new Knowledge(32, 21));
        otherStudent.addLaptopAvailable();
        secondStudent.addLaptopAvailable();

        University university = new University("CHNU", 1, 3);
        CompositeCondition universityCondition = new CompositeCondition();
        universityCondition.add(new WorkDayCondition());
        universityCondition.add(new SummerCondition());
        universityCondition.add(new YearCondition(2018,2019));
        university.addStudent(firstStudent);
        university.addStudent(secondStudent);
        university.addStudent(thirdStudent);

        Internship internship = new Internship("Interlink", 5, 4);
        internship.formListOfStudents(university);
        CompositeCondition internshipCondition = new CompositeCondition();
        internshipCondition.add(new TimePeriodCondition(LocalDate.of(2018,Month.JULY,2),LocalDate.of(2018,Month.SEPTEMBER,27)));
        internshipCondition.add(new WorkDayCondition());

        Meetup interlinkMeetup = new Meetup("Forming Async Mindset", 4,4);
        OneDayCondition oneDayMeetupCondition = new OneDayCondition(LocalDate.of(2018,Month.JULY,12));
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

        DevelopmentPlan easyPlan = new DevelopmentPlan();
        easyPlan.addStudent(secondStudent);
        easyPlan.addPlanEvent(firstStudent,new WeekendCondition());

        long days = ChronoUnit.DAYS.between(LocalDate.of(2018, Month.JUNE, 29),LocalDate.of(2018, Month.DECEMBER, 20));
        LocalDate currentDate = LocalDate.of(2018, Month.JUNE, 29);

        System.out.print(days + "\n");
        for(int i = 0; i <= days; i++){
            easyPlan.apply(currentDate);
            currentDate = LocalDate.of(currentDate.getYear(),currentDate.getMonth(),currentDate.getDayOfMonth()).plusDays(1);
        }
    }
}
