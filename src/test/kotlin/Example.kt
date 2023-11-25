import com.thoughtworks.gauge.Step

class Example {
    @Step("<path>を開く")
    fun open(path: String) {
        Page.page.navigate(path)
    }
}