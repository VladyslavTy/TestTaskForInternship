package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class YearCondition implements Schedule {

    int startYear;
    int finishYear;

    public YearCondition(int startYear, int finishYear){
        this.startYear = startYear;
        this.finishYear = finishYear;
    }

    @Override
    public boolean validate(LocalDate localDate) {
        return (startYear <= localDate.getYear() && localDate.getYear() <= finishYear);
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
