package SearchOffers;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MainSteps {
    WebDriver webDriver;
    MainSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open (String url){webDriver.get(url);
    }


    public MainPage onMainPage(){
        return on(MainPage.class);
    }

    protected <T extends WebPage> T on(Class<T> pageClass) {
        WebPageFactory factory = new WebPageFactory();
        return factory.get(webDriver, pageClass);
    }

    public void shoudSeeUrl() {
        assertThat("Перешли на другой урл",webDriver.getCurrentUrl(),containsString("/cars/audi/all/?sort=fresh_relevance_1-desc&seller_group=PRIVATE&pts_status=1&price_from=1000000"));
    }
    public void ScrollToElement(){
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("scroll(0, 96);"); //подскролл от плашки вверх
    }

}

