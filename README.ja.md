# gauge-playwright-kotlin

[Gauge](https://gauge.org/) + [Playwright](https://playwright.dev/java/) + Kotlin(Maven) のプロジェクトテンプレートです。

[English](README.md)

## テンプレートとして使う

```bash
gauge init gh/U5K492/gauge-playwright-kotlin
```

## 必要な環境

- Java 21+
- Maven 3.8+
- Gauge

  ```bash
  # macOS
  brew install gauge
  gauge install java
  gauge install html-report
  ```

- Playwright ブラウザ（初回のみ）

  ```bash
  mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install chromium"
  ```

## 実行

```bash
gauge run specs
```

## プロジェクト構成

```
.
├── specs/                   # Gaugeスペックファイル (.spec)
├── src/test/kotlin/
│   ├── PlaywrightManager.kt # Playwrightのセットアップ・管理
│   ├── Example.kt           # BeforeSuite / AfterSuite / Step 実装例
│   └── Display.kt           # アサーション実装例
├── env/default/
│   ├── default.properties   # Gauge設定
│   └── java.properties      # Java実行設定
├── fixtures/                # テスト用フィクスチャファイル置き場
└── pom.xml
```

## ライセンス

[Apache 2.0](LICENSE)
