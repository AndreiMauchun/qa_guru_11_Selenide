package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGitSearchHw {

    @Test
    void selenideWikiShouldHavePageSoftAssertionsInGithubWithExampleCodeForJunit5() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $$(".details-reset").findBy(Condition.visible).shouldBe(text("SoftAssertions")).click();

        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"))
                .shouldHave(text("Or register extension inside test class"));
    }
}
