package PageObjects.ThirdPartyLinkedPages;

import org.openqa.selenium.WebDriver;

public class Instagram {

    WebDriver browser;

    public Instagram(WebDriver driver) {

        this.browser = driver;
    }
    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
