import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YahooSearchTests {

    @Test
    void yahooSearchTest() {
        String textForSearch = "selenide";

        open("https://www.yahoo.com/");
        $(byName("p")).setValue(textForSearch).pressEnter();
        $(".compImageProfile").shouldHave(Condition.text(textForSearch));
    }
}

