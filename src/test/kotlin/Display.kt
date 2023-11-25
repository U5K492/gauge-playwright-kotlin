import com.thoughtworks.gauge.Step
import com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat
class Display {
    @Step("GET STARTEDをクリックする")
    fun clickTarget() {
       Page.page.locator("css=.getStarted_Sjon").click()
    }

    @Step("Installationページに遷移する")
    fun assertInstallationPage() {
        assertThat(Page.page).hasTitle("Installation | Playwright Java")
    }
}