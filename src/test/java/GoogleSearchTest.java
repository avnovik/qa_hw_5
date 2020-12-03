import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest {

    @Test
    void googleTests() {
        open("https://www.google.com");
        $("[name='q']").setValue("Selenide").pressEnter();
        $("body").shouldHave(text("selenide.org"));
    }
}
