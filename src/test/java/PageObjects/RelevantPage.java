package PageObjects;

import org.openqa.selenium.WebDriver;

public class RelevantPage {

    WebDriver browser;

    public RelevantPage(WebDriver driver) {

        this.browser = driver;
    }

    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
