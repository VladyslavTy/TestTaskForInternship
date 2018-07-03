package plan;

import institution.KnowledgeSource;

import java.time.LocalDate;
import java.time.Period;

public class PeriodOfDevelopment {
    LocalDate start;
    LocalDate finish;
    Period period;

    public PeriodOfDevelopment(LocalDate start, LocalDate finish){
        this.start = start;
        this.finish = finish;
        this.period = Period.between(start,finish);
    }


}
