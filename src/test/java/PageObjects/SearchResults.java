package PageObjects;

import org.openqa.selenium.WebDriver;

public class SearchResults {

    WebDriver browser;

    public SearchResults(WebDriver driver) {

        this.browser = driver;
    }

    public String getPageTitle() {

        return browser.getTitle();
    }

}
