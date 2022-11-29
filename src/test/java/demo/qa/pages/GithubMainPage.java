package demo.qa.pages;

import com.codeborne.selenide.SelenideElement;
import demo.qa.pages.components.GithubResultPage;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class GithubMainPage {

    private GithubResultPage githubResultPage = new GithubResultPage();
    private final SelenideElement chooseMenu = $(".header-menu-wrapper");



    public GithubMainPage openPage(){
        open("/");
            return this;
    }
    public  GithubMainPage  hoverMenu(String menu, String dropdown){
        chooseMenu.$(withText(menu)).hover();
        chooseMenu.$(withText(dropdown)).click();
        return this;
    }


    public  GithubMainPage githubPageVisible (){
        githubResultPage.checkPageVisible();
        return this;
    }


}
