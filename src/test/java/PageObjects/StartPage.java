package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver browser;

    private String searchInput = "Test";

    By searchButtonPath = By.className("search");
    By searchInputField = By.xpath("//*[@id=\"app\"]/header/div[2]/div/form/fieldset/input[1]");

    public StartPage(WebDriver driver) {

        this.browser = driver;
    }

    public SearchResults getSearchResults(boolean positiveTestcase) {

        if (positiveTestcase == true) {

            browser.findElement(searchButtonPath).click();
            browser.findElement(searchInputField).sendKeys(searchInput);
            browser.findElement(searchInputField).sendKeys(Keys.ENTER);
        }
        else {
            browser.findElement(searchButtonPath).click();
            browser.findElement(searchInputField).sendKeys(Keys.ENTER);
        }
        return new SearchResults(browser);
    }
}
