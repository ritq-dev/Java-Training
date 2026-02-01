package problems.thema3;

import java.util.List;
import java.util.Map;

// Thema3: Stream / Optional（勘定系）
// トランザクションリストや口座情報を Stream/Optional で扱う場面の問題
public class Thema3Problems {

    // トランザクション金額リストのうち、借方（負）の合計を返すこと
    public static int sumDebits(List<Integer> list) {
        throw new UnsupportedOperationException("実装してください");
    }

    // Optional の顧客名が存在すれば返し、無ければデフォルト顧客名を返すこと
    public static String orDefaultCustomer(java.util.Optional<String> opt, String defaultValue) {
        throw new UnsupportedOperationException("実装してください");
    }

    // 口座種別リストを種別ごとにグループ化して Map を返すこと
    public static Map<String, List<String>> groupByAccountType(List<String> list) {
        throw new UnsupportedOperationException("実装してください");
    }

    // 追加問題: トランザクションリストから最高額の入金を Optional で取得すること
    public static java.util.Optional<Integer> maxCredit(List<Integer> list) {
        throw new UnsupportedOperationException("実装してください");
    }
}
