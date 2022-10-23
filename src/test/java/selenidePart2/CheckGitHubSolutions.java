package selenidePart2;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckGitHubSolutions extends TestSettings {

    @Test
    public void openEnterprisePage() {

        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".application-main").shouldHave(Condition.text("Build like the best"));
    }
}
