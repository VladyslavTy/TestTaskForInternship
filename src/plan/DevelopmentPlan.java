package plan;

import institution.KnowledgeSource;
import person.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DevelopmentPlan {

    ArrayList<Student> students;
    Map<KnowledgeSource, Schedule> planEvents;

    public DevelopmentPlan(){
        this.students = new ArrayList<>();
        this.planEvents = new HashMap<>();
      }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addPlanEvent(KnowledgeSource source, Schedule condition){
        planEvents.put(source, condition);
    }

    public void apply(LocalDate localDate){
        System.out.print(localDate + ":\n");
        for (Student student : students){
            planEvents.forEach((source, condition) -> {
                if(condition.validate(localDate)){
                    System.out.print(student.name +": ");
                    printStudentKnowledge(student);
                    System.out.print("->");
                    source.teach(student);
                    printStudentKnowledge(student);
                    System.out.print("\n");
                }
                else {

                }
            });
        }
    }

    private void printStudentKnowledge(Student student){
        System.out.print(student.knowledge.levelOfTheory + "," + student.knowledge.levelOfPractice);
    }
}
