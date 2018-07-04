package plan.conditions;

import plan.Schedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompositeCondition implements Schedule {
    ArrayList<Schedule> conditionsList = new ArrayList<>();

    @Override
    public boolean validate(LocalDate localDate) {
        boolean validate = true;
        for (Schedule condition: conditionsList
             ) {
            if (!condition.validate(localDate)) {
                validate = false;
                break;
             }
        }
        return validate;
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
