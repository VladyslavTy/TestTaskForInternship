package plan.conditions;

import plan.Schedule;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class WeekNumber implements Schedule {

    LocalDate dayOfWeekInTheMonth;
    LocalDate localDate;

    public WeekNumber(int number, DayOfWeek day){
        localDate = LocalDate.now();
        dayOfWeekInTheMonth = localDate.with(TemporalAdjusters.dayOfWeekInMonth(number,day));
    }

    @Override
    public boolean validate(LocalDate localDate) {
        return (localDate == dayOfWeekInTheMonth);
    }

    @Override
    public void add(Schedule schedule) {

    }

    @Override
    public void remove(Schedule schedule) {

    }
}
