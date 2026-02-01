package problems.thema5;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

// Thema5: 並行処理/非同期（勘定系）
// 勘定系バッチ処理や非同期集計に関する問題
public class Thema5Problems {

    // トランザクション金額のリストを並列で合計して返すこと
    public static int parallelSum(List<Integer> list) {
        throw new UnsupportedOperationException("実装してください");
    }

    // 非同期に計算して CompletableFuture を返す（入力の2倍を返す）
    public static CompletableFuture<Integer> asyncDouble(int x) {
        throw new UnsupportedOperationException("実装してください");
    }

    // Callable のリストを ExecutorService で実行して結果の合計を返すこと
    public static int invokeAllAndSum(List<Callable<Integer>> tasks) throws Exception {
        throw new UnsupportedOperationException("実装してください");
    }
}
