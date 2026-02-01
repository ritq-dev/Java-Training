package problems.thema4;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class Thema4ProblemsTest {

    @Test
    void testDaysBetween() {
        LocalDate a = LocalDate.of(2020,1,1);
        LocalDate b = LocalDate.of(2020,1,6);
        assertEquals(5, Thema4Problems.daysBetween(a,b));
        System.out.println("✓ testDaysBetween");
    }

    @Test
    void testParseIso() {
        LocalDateTime dt = Thema4Problems.parseIso("2020-01-02T03:04:05");
        assertEquals(2020, dt.getYear());
        assertEquals(1, dt.getMonthValue());
        System.out.println("✓ testParseIso");
    }

    @Test
    void testFormatIso() {
        LocalDateTime dt = LocalDateTime.of(2021,2,3,4,5,6);
        assertEquals("2021-02-03T04:05:06", Thema4Problems.formatIso(dt));
        System.out.println("✓ testFormatIso");
    }
}
