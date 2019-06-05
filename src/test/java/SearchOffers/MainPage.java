package SearchOffers;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;
import org.openqa.selenium.interactions.SendKeysAction;

public interface MainPage extends WebPage {
        @FindBy(".//span[contains(@class, 'Link ListingCarsFilters-module__actionCollapse') and contains(., 'Все параметры')]")
        HtmlElement AllParametres();
        @FindBy("//span[contains(@class, 'Button__text') and contains(., 'Частник')]")
        HtmlElement ButtonClick();
        @FindBy("//div[contains(@class, 'ListingCarsFilters-module__columnControlHalf') and contains(., 'Оригинал ПТС')]")
        HtmlElement CheckboxClick();
        @FindBy("//div[contains(@class, 'TextInput__input') and contains(., 'Цена от')]")
        HtmlElement PriceFound();
        @FindBy("//input[contains(@class, 'TextInput__control') and contains(@name, 'price_from')]")
        HtmlElement PriceInput();
        @FindBy("//span[contains(@class, 'Button__text') and contains(., 'Марка')]")
        HtmlElement ClickMark();
        @FindBy("//div[contains(@class, 'MenuItem') and contains(., 'Audi')]")
        HtmlElement SelectMark();
        @FindBy("//span[contains(@class, 'ButtonWithLoader__content') and contains(., 'Показать')]")
        HtmlElement ViewOffers();

}
