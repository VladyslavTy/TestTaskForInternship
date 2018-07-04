package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class OneDayCondition implements Schedule {

    LocalDate meetingDate;

    public OneDayCondition(LocalDate meetingDate){
        this.meetingDate = meetingDate;
    }

    @Override
    public boolean validate(LocalDate localDate) {
        return (localDate == meetingDate);
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
