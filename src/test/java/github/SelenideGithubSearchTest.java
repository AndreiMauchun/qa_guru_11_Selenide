package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGithubSearchTest {

    @Test
    void shouldFindSelenideRepository() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));

        sleep(5000);
    }

}
