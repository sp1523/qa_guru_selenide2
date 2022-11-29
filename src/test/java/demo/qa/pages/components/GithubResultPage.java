package demo.qa.pages.components;

import com.codeborne.selenide.Condition;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class GithubResultPage {

    private final static String Title_Text = "Build like the best";

    public GithubResultPage checkPageVisible ()
    {
        $(".logged-out").should(exist);
        $("h1").shouldHave(Condition.text(Title_Text));
        return this;
    }
}
