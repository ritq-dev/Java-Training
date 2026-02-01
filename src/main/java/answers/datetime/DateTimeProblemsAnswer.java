package answers.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeProblemsAnswer {

    public static long daysBetween(LocalDate start, LocalDate end) {
        return Duration.between(start.atStartOfDay(), end.atStartOfDay()).toDays();
    }

    public static LocalDateTime parseIso(String iso) {
        return LocalDateTime.parse(iso, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public static String formatIso(LocalDateTime dt) {
        return dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
