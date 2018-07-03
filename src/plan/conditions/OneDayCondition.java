package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class OneDayCondition implements Schedule {
    public boolean validate(LocalDate localDate) {
        return true;
    }
}
