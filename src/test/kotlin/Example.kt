import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.AfterSpec
import com.thoughtworks.gauge.BeforeScenario
import com.thoughtworks.gauge.Step

class Example {

    @AfterSpec
    fun closeBrowser() {
        PlaywrightManager.closeBrowser()
    }

    @AfterScenario
    fun refreshBrowser() {
        PlaywrightManager.refreshBrowserContext()
    }

    @Step("<path>を開く")
    fun open(path: String) {
        PlaywrightManager.page().navigate(path)
    }
}