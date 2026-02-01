package problems.thema1;

import java.util.List;

// Thema1: ジェネリクス/型パラメタ（勘定系）
// 銀行勘定系の顧客情報リスト（支店コード、科目、口座番号）を扱う場面を想定した問題群
public class Thema1Problems {

    // 顧客情報を可変長引数で受け取り List にして返すこと
    // 例: createAccountList(acc1, acc2, ...)
    public static <T> List<T> createAccountList(T... items) {
        throw new UnsupportedOperationException("実装してください");
    }

    // 顧客リストの中で指定した支店コードに該当する口座数を数えて返すこと
    public static int countByBranch(List<?> accounts, Object branchCode) {
        throw new UnsupportedOperationException("実装してください");
    }

    // 口座残高を持つオブジェクトリストから最大残高の口座を返すこと（null 不許可）
    public static Comparable findMaxBalance(List<? extends Comparable> list) {
        throw new UnsupportedOperationException("実装してください");
    }
}
