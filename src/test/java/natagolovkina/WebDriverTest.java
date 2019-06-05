package natagolovkina;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

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
        mainSteps.open("https://test.avto.ru");
        mainSteps.onMainPage().offers().click();
        mainSteps.shoudSeeUrl("cars/all/");

    }
}