import com.microsoft.playwright.Browser
import com.microsoft.playwright.BrowserContext
import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Page
import com.microsoft.playwright.Playwright

object PlaywrightManager {
    private lateinit var playwright: Playwright
    private lateinit var browser: Browser
    private lateinit var context: BrowserContext
    private lateinit var page: Page

    fun setup() {
        playwright = Playwright.create()
        browser = playwright.chromium().launch(BrowserType.LaunchOptions().setHeadless(false))
        context = browser.newContext()
        page = context.newPage()
    }

    fun page(): Page {
        if (page.isClosed) {
            page = context.newPage()
        }
        return page
    }

    fun refreshBrowserContext() {
        page.close()
        context.close()
        context = browser.newContext()
        page = context.newPage()
    }

    fun teardown() {
        playwright.close()
    }
}