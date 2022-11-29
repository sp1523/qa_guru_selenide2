package demo.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InternetDragAndDropPage {



    private final SelenideElement firstElementToDrag = $("#column-a");
    private final SelenideElement secondElementToDrag = $("#column-b");

    public InternetDragAndDropPage openPage(){
        open("/drag_and_drop");
        return this;
    }

    public InternetDragAndDropPage columnDragAndDrop(){
     firstElementToDrag.dragAndDropTo(secondElementToDrag);
        return this;
    }

    public InternetDragAndDropPage checkDragResults(String first_header_text, String second_header_text){
        firstElementToDrag.$("header").shouldHave(Condition.text(second_header_text));
        secondElementToDrag.$("header").shouldHave(Condition.text(first_header_text));
        return this;
    }

}
