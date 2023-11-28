import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Page
import com.microsoft.playwright.Playwright

object PlaywrightManager {
    private val playwright = Playwright.create()
    private val browser = this.playwright.chromium().launch(BrowserType.LaunchOptions().setHeadless(false))

    private var context = browser.newContext()
    private var page = context.newPage()!!
    fun page(): Page {
        if (this.page.isClosed) {
            page = context.newPage()!!
            return page
        }
        return page
    }
    fun refreshBrowserContext() {
        page.close()
        context.close()
        context = browser.newContext()
    }

    fun closeBrowser() {
        page.close()
        context.close()
    }
}