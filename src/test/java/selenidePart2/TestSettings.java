package selenidePart2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestSettings {

    @BeforeAll
    static void configure() {
        Configuration.holdBrowserOpen = true;
    }
}
