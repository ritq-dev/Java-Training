package problems.thema2;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class Thema2ProblemsTest {

    @Test
    void testCountAccounts() {
        List<String> l = Arrays.asList("101-1-1234567","101-1-7654321","101-1-1234567","102-1-9999999","101-1-7654321","101-1-1234567");
        Map<String,Integer> m = Thema2Problems.countAccounts(l);
        assertEquals(3, m.get("101-1-1234567"));
        assertEquals(2, m.get("101-1-7654321"));
        System.out.println("✓ testCountAccounts");
    }

    @Test
    void testRemoveAccount() {
        List<String> l = Arrays.asList("101-1-1234567","101-1-2222222","101-1-1234567","101-1-3333333");
        java.util.List<String> out = Thema2Problems.removeAccount(new java.util.ArrayList<>(l), "101-1-1234567");
        assertFalse(out.contains("101-1-1234567"));
        assertEquals(2, out.size());
        System.out.println("✓ testRemoveAccount");
    }

    @Test
    void testMakeAccountLRU() {
        java.util.List<String> keys = Arrays.asList("101-1-1111111","101-1-2222222","101-1-3333333","101-1-4444444");
        java.util.Map<String,String> lru = Thema2Problems.makeAccountLRU(3, keys);
        assertEquals(3, lru.size());
        System.out.println("✓ testMakeAccountLRU");
    }

    @Test
    void testCountByBranch() {
        List<String> l = Arrays.asList("101","102","101","103","102");
        java.util.Map<String, Long> m = Thema2Problems.countByBranch(l);
        assertEquals(2L, m.get("102").longValue());
        System.out.println("✓ testCountByBranch");
    }
}
