training-java: Java スキルアップ問題集 (銀行勘定系コンテキスト)

目的
- Java 固有の標準クラスや API を、銀行勘定系でよく使われる場面（店番、科目、口座番号、取引金額、仕訳ファイルなど）で学ぶための問題集

目次
- Thema1: ジェネリクス / 型パラメタ（顧客・口座リスト操作）
- Thema2: コレクション操作（口座集計、安全な削除、簡易LRU）
- Thema3: Stream / Optional（トランザクション集計、Optional の活用）
- Thema4: Date/Time（取引日・会計日の計算とフォーマット）
- Thema5: 並行処理 / 非同期（バッチ集計、非同期計算）
- Thema6: IO（仕訳・口座データの読み書き、シリアライズ）

構成
- 問題スタブ: `src/main/java/problems/thema{1..6}`
- 回答例: `src/main/java/answers/thema{1..6}` （参考実装）
- テスト: `src/test/java/problems/thema{1..6}` （TDD 用の UT）
- 実行スクリプト: `scripts/` に各テーマ用の .sh を配置


テスト実行

以下はプロジェクトルートでの `gradlew` / `gradlew.bat` を使った実行例です。

UNIX 系 (Git Bash / WSL / macOS ターミナル)

```bash
# 全テストを実行
./gradlew test

# 単一テストクラスを実行 (例: Thema1ProblemsTest)
./gradlew test --tests "problems.thema1.Thema1ProblemsTest"

# 単一テストメソッドを実行 (完全修飾メソッド名またはワイルドカード)
./gradlew test --tests "problems.thema1.Thema1ProblemsTest.testCreateAccountList"
./gradlew test --tests "problems.thema1.Thema1ProblemsTest.*"
```

Windows (PowerShell / CMD)

```powershell
# 全テストを実行
.\gradlew.bat test

# 単一テストクラスを実行
.\gradlew.bat test --tests "problems.thema1.Thema1ProblemsTest"

# 単一テストメソッドを実行
.\gradlew.bat test --tests "problems.thema1.Thema1ProblemsTest.testCreateAccountList"
```

注意
- `--tests` の指定はクォートで囲んでください（シェルによるワイルドカード展開を避けるため）。
- PowerShell ではパス区切りに `\` を使うか `.
` の形式で `gradlew.bat` を呼び出してください。
- ローカルに Gradle がない場合は、プロジェクトで `gradle wrapper` を生成すると `./gradlew` が自動で動作するようになります。

テストの見方
- 各 UT 内で成功時に `✓ testName` を出力します。テスト結果の詳細は Gradle の出力や IDE のテストビューでご確認ください。

次のステップ
- まだ問題メソッド本体はスタブ（UnsupportedOperationException）になっています。TDD でテーマごとに実装していくことを想定しています。私に代わりに実装してテストを通すこともできます。希望を教えてください。
