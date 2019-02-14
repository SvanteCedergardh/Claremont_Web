package PageObjects;

import org.openqa.selenium.WebDriver;

public class Contact {

    WebDriver browser;

    public Contact(WebDriver driver) {

        this.browser = driver;
    }

    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
