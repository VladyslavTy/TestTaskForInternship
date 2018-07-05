package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompositeCondition implements Schedule {
    ArrayList<Schedule> conditionsList = new ArrayList<>();

    @Override
    public boolean validate(LocalDate localDate) {
        boolean validateMatch = true;
        for (Schedule condition : conditionsList
             ) {
            if (!condition.validate(localDate)) {
                validateMatch = false;
                break;
             }
        }
        return validateMatch;
    }

    @Override
    public void add(Schedule condition) {
        conditionsList.add(condition);
    }

    @Override
    public void remove(Schedule condition) {
        conditionsList.remove(condition);
    }
}
