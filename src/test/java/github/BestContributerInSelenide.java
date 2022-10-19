package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class BestContributerInSelenide {

    @Test
    void andreiSolntsevShouldBeFirstContributer() {

        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(Selectors.byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li")
                .first().hover();
        $(".Popover-message")
                .shouldHave(Condition.text("Andrei Solntsev"));
    }
}
