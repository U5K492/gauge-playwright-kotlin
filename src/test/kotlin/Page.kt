import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Playwright

object Page {
    private val playwright = Playwright.create()
    private val browser = this.playwright.chromium().launch(BrowserType.LaunchOptions().setHeadless(false))

    private val context = browser.newContext()
    val page = context.newPage()
}