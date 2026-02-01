package problems.thema1;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Thema1ProblemsTest {

    @Test
    void testCreateAccountList() {
        List<String> l = Thema1Problems.createAccountList("101-1-1234567", "101-1-7654321");
        assertEquals(Arrays.asList("101-1-1234567","101-1-7654321"), l);
        System.out.println("✓ testCreateAccountList");
    }

    @Test
    void testCountByBranch() {
        List<String> l = Arrays.asList("101","102","101","103","101");
        assertEquals(3, Thema1Problems.countByBranch(l, "101"));
        System.out.println("✓ testCountByBranch");
    }

    @Test
    void testFindMaxBalance() {
        List<Integer> l = Arrays.asList(100000,700000,200000);
        assertEquals(700000, Thema1Problems.findMaxBalance(l));
        System.out.println("✓ testFindMaxBalance");
    }
}
