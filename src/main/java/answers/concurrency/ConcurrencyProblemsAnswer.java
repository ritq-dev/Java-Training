package answers.concurrency;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ConcurrencyProblemsAnswer {

    public static int parallelSum(List<Integer> list) {
        return list.parallelStream().mapToInt(Integer::intValue).sum();
    }

    public static CompletableFuture<Integer> asyncDouble(int x) {
        return CompletableFuture.supplyAsync(() -> x * 2);
    }

    public static int invokeAllAndSum(List<Callable<Integer>> tasks) throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(Math.min(tasks.size(), 4));
        try {
            List<Future<Integer>> futures = ex.invokeAll(tasks);
            int sum = 0;
            for (Future<Integer> f : futures) sum += f.get();
            return sum;
        } finally {
            ex.shutdown();
        }
    }
}
