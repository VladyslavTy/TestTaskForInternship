package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class WeeklyCondition implements Schedule {
    public boolean validate(LocalDate localdate){
        switch (localdate.getDayOfWeek()){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            return true;
        }
        return false;
    }
}
