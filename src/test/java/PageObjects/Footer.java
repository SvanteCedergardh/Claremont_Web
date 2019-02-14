package PageObjects;

import PageObjects.SocialMediaPages.Facebook;
import PageObjects.SocialMediaPages.Instagram;
import PageObjects.SocialMediaPages.LinkedIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {

    WebDriver browser;

    By instagramLinkPath = By.xpath("/html/body/footer/div/div[5]/div[1]/div/a[1]");
    By facebookLinkPath = By.xpath("/html/body/footer/div/div[5]/div[1]/div/a[2]");
    By linkedInLinkPath = By.xpath("/html/body/footer/div/div[5]/div[1]/div/a[3]");

    public Footer(WebDriver driver) {

        this.browser = driver;
    }
    public Instagram visitInstagram() {

        WebElement link = browser.findElement(instagramLinkPath);
        String instagramHref = link.getAttribute("href");
        browser.get(instagramHref);

        return new Instagram(browser);
    }
    public Facebook visitFacebook() {

        WebElement link = browser.findElement(facebookLinkPath);
        String facebookHref = link.getAttribute("href");
        browser.get(facebookHref);

        return new Facebook(browser);
    }
    public LinkedIn visitLinkedIn() {

        WebElement link = browser.findElement(linkedInLinkPath);
        String linkedInHref = link.getAttribute("href");
        browser.get(linkedInHref);

        return new LinkedIn(browser);
    }
}
