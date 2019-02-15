package PageObjects.ThirdPartyLinkedPages;

import org.openqa.selenium.WebDriver;

public class Facebook {

    WebDriver browser;

    public Facebook(WebDriver driver) {

        this.browser = driver;
    }
    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
