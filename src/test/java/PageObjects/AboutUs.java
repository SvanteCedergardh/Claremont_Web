package PageObjects;

import org.openqa.selenium.WebDriver;

public class AboutUs {

    WebDriver browser;

    public AboutUs(WebDriver driver) {

        this.browser = driver;
    }

    public String verifyPage() {

        return browser.getCurrentUrl();
    }
}
