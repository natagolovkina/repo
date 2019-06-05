package SearchOffers;

import natagolovkina.WebDriverRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WebDriverTest {
    MainSteps mainSteps;

    @Rule
    public WebDriverRule webDriverRule = new WebDriverRule();

    @Before
    public void setUp() {
        mainSteps = new MainSteps(webDriverRule.driver());
    }

    @Test
    public void test() {
        mainSteps.open("https://auto.ru/cars/all/");
        mainSteps.onMainPage().AllParametres().click();
        mainSteps.ScrollToElement();
        mainSteps.onMainPage().ButtonClick().click();
        mainSteps.onMainPage().CheckboxClick().click();
        mainSteps.onMainPage().PriceFound().click();
        mainSteps.onMainPage().PriceInput().sendKeys("1000000");
        mainSteps.onMainPage().ClickMark().click();
        mainSteps.onMainPage().SelectMark().click();
        mainSteps.onMainPage().ViewOffers().click();
        mainSteps.shoudSeeUrl();
    }

}
