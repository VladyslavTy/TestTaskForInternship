package plan;

import institution.KnowledgeSource;
import person.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class DevelopmentPlan {

    ArrayList<Student> students;
    Map<KnowledgeSource, Schedule> planEvents;

    public DevelopmentPlan(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addPlanEvent(KnowledgeSource source, Schedule condition){
        planEvents.put(source,condition);
    }

    public void apply(LocalDate localDate){
        for (Student student : students){
            planEvents.forEach((source, schedule) -> {
                if(schedule.validate(localDate)){
                    source.teach(student);
                }
            });
        }
    }
}
