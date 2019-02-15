package PageObjects;

import org.openqa.selenium.WebDriver;

public class WorkForUs {

    WebDriver browser;

    public WorkForUs(WebDriver driver) {

        this.browser = driver;
    }

    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
