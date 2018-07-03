package plan;

import institution.KnowledgeSource;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class DevelopmentPlan {
    String name;
    PeriodOfDevelopment devPeriod;
    ArrayList<KnowledgeSource> sources = new ArrayList<>();
    public DevelopmentPlan(String name){
        this.name = name;
    }
    public void addSource(KnowledgeSource source){
        this.sources.add(source);
    }
}
