package demo.qa;

import com.codeborne.selenide.Configuration;

import demo.qa.pages.InternetDragAndDropPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class DragAndDropWithPageObjects {
    InternetDragAndDropPage internetDragAndDropPage = new InternetDragAndDropPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void columnsDragAndDropTest(){
      internetDragAndDropPage.openPage()
              .columnDragAndDrop()
              .checkDragResults("A","B");
    }


}
