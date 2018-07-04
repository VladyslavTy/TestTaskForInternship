package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;
import java.time.Month;

public class SummerCondition implements Schedule {

    @Override
    public boolean validate(LocalDate localDate) {
        return (localDate.getMonth() != Month.JUNE && localDate.getMonth() != Month.JULY && localDate.getMonth() != Month.AUGUST );
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
