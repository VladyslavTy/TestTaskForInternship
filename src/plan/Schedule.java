package plan;

import java.time.LocalDate;

public interface Schedule {
    boolean validate(LocalDate localDate);
}
