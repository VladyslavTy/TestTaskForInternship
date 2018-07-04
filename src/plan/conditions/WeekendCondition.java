package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class WeekendCondition implements Schedule {
    public boolean validate(LocalDate localdate){
        switch (localdate.getDayOfWeek()){
            case SUNDAY:
            case SATURDAY:
                return true;
        }
        return false;
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
