import com.thoughtworks.gauge.Step
import com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat
class Display {
    @Step("GET STARTEDをクリックする")
    fun clickTarget() {
       PlaywrightManager.page().locator("css=.getStarted_Sjon").click()
    }

    @Step("Installationページに遷移する")
    fun assertInstallationPage() {
        assertThat(PlaywrightManager.page()).hasTitle("Installation | Playwright Java")
    }
}