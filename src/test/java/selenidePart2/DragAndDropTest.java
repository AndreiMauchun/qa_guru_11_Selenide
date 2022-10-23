package selenidePart2;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
    public void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    public void dragAndDropWithElementTest() {
        // передвигает колонку А вместо где стоит мой курсор, в не зависимости какие я выставил параметры в moveByOffset
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Подвинуть курсор к элементу, кликнуть и держать, передвинуть по X и Y, отпустить кнопку мыши
        actions().moveToElement($("#column-a")).clickAndHold()
                .moveByOffset(100, 10).release().perform();
        $("#column-b").shouldHave(text("A"));
    }


    @Test
    public void dragAndDropWithElementTest2() {
        // Та же история, что и с первым тестом
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Подвинуть курсор к элементу, кликнуть и держать, передвинуть по X и Y, отпустить кнопку мыши
        actions().moveToElement($("#column-a")).clickAndHold()
                .moveToElement($("#column-b")).release().perform();
        $("#column-b").shouldHave(text("A"));
    }



    @Test
    public void dragAndDropWithElementTest3() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Подвинуть курсор к элементу, кликнуть и держать, передвинуть по X и Y, отпустить кнопку мыши
        actions().clickAndHold($("#column-a"))
                .moveToElement($("#column-b")).release().build().perform();
        $("#column-b").shouldHave(text("A"));
    }





    @Test
    public void dragAndDropWithElementTest4() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement sourseElem = $("#column-a");
        SelenideElement targetElem = $("#column-b");
        actions().dragAndDrop(sourseElem, targetElem).build().perform();

    }


}
