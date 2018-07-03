package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;
import java.time.Period;

public class YearPeriodCondition implements Schedule {
    @Override
    public boolean validate(LocalDate localDate) {
        return false;
    }
}
