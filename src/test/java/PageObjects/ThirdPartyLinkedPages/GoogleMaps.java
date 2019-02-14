package PageObjects.ThirdPartyLinkedPages;

import org.openqa.selenium.WebDriver;

public class GoogleMaps {

    WebDriver browser;

    public GoogleMaps(WebDriver driver) {

        this.browser = driver;
    }
    public String getPageTitle() {

        return browser.getTitle();
    }
}
