import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.AfterSuite
import com.thoughtworks.gauge.BeforeSuite
import com.thoughtworks.gauge.Step

class Example {

    @BeforeSuite
    fun setup() {
        PlaywrightManager.setup()
    }

    @AfterSuite
    fun teardown() {
        PlaywrightManager.teardown()
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