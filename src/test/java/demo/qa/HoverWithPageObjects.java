package demo.qa;


import com.codeborne.selenide.Configuration;
import demo.qa.pages.GithubMainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class HoverWithPageObjects {

    GithubMainPage githubMainPage = new GithubMainPage();


    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void githubHoverMenuTest (){
        githubMainPage.openPage()
                .hoverMenu("Solutions","Enterprise");


      githubMainPage.githubPageVisible();


    }

}
