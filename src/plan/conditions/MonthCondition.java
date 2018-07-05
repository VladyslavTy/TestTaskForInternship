package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;
import java.time.Month;

public class MonthCondition implements Schedule {

    Month month;

    public MonthCondition(Month month){
        this.month = month;
    }

    @Override
    public boolean validate(LocalDate localDate) {
        return localDate.getMonth() == this.month;
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
