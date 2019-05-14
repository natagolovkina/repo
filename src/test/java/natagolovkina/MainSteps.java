package natagolovkina;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class MainSteps {
    WebDriver webDriver;
    MainSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open (String url){
        webDriver.get(url);
    }

    public void shoudSeeUrl (String url){
        assertThat("Перешли на другой урл",webDriver.getCurrentUrl(),containsString("cars/all/"));

    }

    public MainPage onMainPage(){
        return on(MainPage.class);
    }

    protected <T extends WebPage> T on(Class<T> pageClass) {
        WebPageFactory factory = new WebPageFactory();
        return factory.get(webDriver, pageClass);
    }
}
