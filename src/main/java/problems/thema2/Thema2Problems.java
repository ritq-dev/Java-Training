package problems.thema2;

import java.util.List;
import java.util.Map;

// Thema2: コレクション操作（勘定系）
// 顧客リストに対する集計や安全な削除、簡易LRUキャッシュなど、勘定系でよく出てくる操作の問題
public class Thema2Problems {

    // 口座番号リストの出現回数を Map で返すこと（口座番号 -> 出現数）
    public static Map<String, Integer> countAccounts(List<String> list) {
        throw new UnsupportedOperationException("実装してください");
    }

    // イテレータを使って指定した口座番号を全て削除し、変更済みリストを返すこと
    public static List<String> removeAccount(List<String> list, String account) {
        throw new UnsupportedOperationException("実装してください");
    }

    // LinkedHashMap を使って簡単な LRU 振る舞いを示す Map を作ること（容量 cap）
    public static java.util.Map<String, String> makeAccountLRU(int cap, java.util.List<String> keys) {
        throw new UnsupportedOperationException("実装してください");
    }

    // 追加問題: 支店ごとのアカウント数を集計して Map を返すこと
    public static Map<String, Long> countByBranch(List<String> branchCodes) {
        throw new UnsupportedOperationException("実装してください");
    }
}
