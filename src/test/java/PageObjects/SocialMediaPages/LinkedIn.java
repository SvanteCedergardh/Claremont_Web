package PageObjects.SocialMediaPages;

import org.openqa.selenium.WebDriver;

public class LinkedIn {

    WebDriver browser;

    public LinkedIn(WebDriver driver) {

        this.browser = driver;
    }
    public String verifyPage() {

        return browser.getTitle();
    }
}
