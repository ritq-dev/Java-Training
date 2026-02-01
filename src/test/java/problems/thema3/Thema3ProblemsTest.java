package problems.thema3;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class Thema3ProblemsTest {

    @Test
    void testSumDebits() {
        List<Integer> l = Arrays.asList(-100,200,-50,300);
        assertEquals(-150, Thema3Problems.sumDebits(l));
        System.out.println("✓ testSumDebits");
    }

    @Test
    void testOrDefaultCustomer() {
        assertEquals("Alice", Thema3Problems.orDefaultCustomer(Optional.of("Alice"), "Default"));
        assertEquals("Default", Thema3Problems.orDefaultCustomer(Optional.empty(), "Default"));
        System.out.println("✓ testOrDefaultCustomer");
    }

    @Test
    void testGroupByAccountType() {
        List<String> l = Arrays.asList("savings","checking","savings","loan");
        Map<String, List<String>> m = Thema3Problems.groupByAccountType(l);
        assertEquals(2, m.get("savings").size());
        System.out.println("✓ testGroupByAccountType");
    }

    @Test
    void testMaxCredit() {
        List<Integer> l = Arrays.asList(-10, 100, 50, -20);
        assertEquals(Optional.of(100), Thema3Problems.maxCredit(l));
        System.out.println("✓ testMaxCredit");
    }
}
