package plan;

import institution.KnowledgeSource;

import java.time.LocalDate;
import java.time.Period;

public class PeriodOfDevelopment {
    LocalDate start;
    LocalDate finish;
    Period period;
    Schedule condition;

    public PeriodOfDevelopment(LocalDate start, LocalDate finish, Schedule condition){
        this.start = start;
        this.finish = finish;
        this.period = Period.between(start,finish);
        this.condition = condition;
    }

}
