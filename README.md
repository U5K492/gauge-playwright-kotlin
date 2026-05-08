# gauge-playwright-kotlin

A project template for [Gauge](https://gauge.org/) + [Playwright](https://playwright.dev/java/) + Kotlin (Maven).

[日本語](README.ja.md)

## Use as a template

```bash
gauge init gh/U5K492/gauge-playwright-kotlin
```

## Prerequisites

- Java 21+
- Maven 3.8+
- Gauge

  ```bash
  # macOS
  brew install gauge
  gauge install java
  gauge install html-report
  ```

- Playwright browsers (first time only)

  ```bash
  mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install chromium"
  ```

## Run

```bash
gauge run specs
```

## Project structure

```
.
├── specs/                   # Gauge spec files (.spec)
├── src/test/kotlin/
│   ├── PlaywrightManager.kt # Playwright setup and lifecycle management
│   ├── Example.kt           # BeforeSuite / AfterSuite / Step examples
│   └── Display.kt           # Assertion examples
├── env/default/
│   ├── default.properties   # Gauge configuration
│   └── java.properties      # Java execution configuration
├── fixtures/                # Test fixture files
└── pom.xml
```

## License

[Apache 2.0](LICENSE)
