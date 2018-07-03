package plan;

import institution.KnowledgeSource;
import person.Student;
import java.util.ArrayList;

public class DevelopmentPlan {
    String name;
    PeriodOfDevelopment devPeriod;
    ArrayList<Student> listOfStudents = new ArrayList<>();
    ArrayList<KnowledgeSource> sources = new ArrayList<>();

    public DevelopmentPlan(String name, PeriodOfDevelopment period){
        this.name = name;
        this.devPeriod = period;
    }
    public void addSource(KnowledgeSource source){
        this.sources.add(source);
    }

    public void apply(Student student){
        for (KnowledgeSource source : sources
             ) {
            source.teach(student);
        }
    }
}
