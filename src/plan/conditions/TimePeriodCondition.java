package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;

public class TimePeriodCondition implements Schedule{

    LocalDate startDate;
    LocalDate finishDate;

    public TimePeriodCondition(LocalDate startDate, LocalDate finishDate){
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Override
    public boolean validate(LocalDate localDate) {
        return (localDate.isAfter(startDate) && localDate.isBefore(finishDate));
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }

}
