package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class OneDayInTheMonthCondition implements Schedule {
    LocalDate meetingDate;

    public OneDayInTheMonthCondition(LocalDate meetingDate){
        this.meetingDate = meetingDate;
    }

    @Override
    public boolean validate(LocalDate localDate) {
        return this.meetingDate.getDayOfMonth() != localDate.getDayOfMonth();
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
