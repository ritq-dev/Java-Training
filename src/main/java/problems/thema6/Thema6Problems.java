package problems.thema6;

import java.nio.file.Path;
import java.io.Serializable;

// Thema6: IO（勘定系）
// 仕訳ファイルや口座データの読み書き、オブジェクトのシリアライズなどの問題
public class Thema6Problems {

    // ファイルを行単位で読み込み List<String> を返すこと
    public static java.util.List<String> readLines(Path path) throws Exception {
        throw new UnsupportedOperationException("実装してください");
    }

    // シリアライズ可能なオブジェクトをバイナリで深いコピーして返すこと
    public static Object deepCopySerializable(Serializable obj) throws Exception {
        throw new UnsupportedOperationException("実装してください");
    }

    // ファイルをコピーすること（バイト単位）
    public static void copyFile(Path src, Path dest) throws Exception {
        throw new UnsupportedOperationException("実装してください");
    }
}
