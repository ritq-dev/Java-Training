package problems.thema5;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import static org.junit.jupiter.api.Assertions.*;

public class Thema5ProblemsTest {

    @Test
    void testParallelSum() {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        assertEquals(15, Thema5Problems.parallelSum(l));
        System.out.println("✓ testParallelSum");
    }

    @Test
    void testAsyncDouble() throws Exception {
        CompletableFuture<Integer> f = Thema5Problems.asyncDouble(5);
        assertEquals(10, f.get().intValue());
        System.out.println("✓ testAsyncDouble");
    }

    @Test
    void testInvokeAllAndSum() throws Exception {
        List<Callable<Integer>> tasks = Arrays.asList(() -> 1, () -> 2, () -> 3);
        assertEquals(6, Thema5Problems.invokeAllAndSum(tasks));
        System.out.println("✓ testInvokeAllAndSum");
    }
}
