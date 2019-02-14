package PageObjects.BlueContainer;

import PageObjects.*;
import PageObjects.ThirdPartyLinkedPages.Facebook;
import PageObjects.ThirdPartyLinkedPages.GoogleMaps;
import PageObjects.ThirdPartyLinkedPages.Instagram;
import PageObjects.ThirdPartyLinkedPages.LinkedIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {

    WebDriver browser;

    By whatWeDoLinkPath = By.xpath("/html/body/footer/div/div[1]/ul/li[1]/h2/a");
    By whatWeHaveDoneLinkPath = By.xpath("/html/body/footer/div/div[1]/ul/li[2]/h2/a");
    By workForUsLinkPath = By.xpath("/html/body/footer/div/div[1]/ul/li[3]/h2/a");

    By relevantLinkPath = By.xpath("/html/body/footer/div/div[2]/ul/li[1]/a");
    By aboutUsLinkPath = By.xpath("/html/body/footer/div/div[2]/ul/li[2]/a");
    By contactLinkPath = By.xpath("/html/body/footer/div/div[2]/ul/li[3]/a");

    By instagramLinkPath = By.xpath("/html/body/footer/div/div[5]/div[1]/div/a[1]");
    By facebookLinkPath = By.xpath("/html/body/footer/div/div[5]/div[1]/div/a[2]");
    By linkedInLinkPath = By.xpath("/html/body/footer/div/div[5]/div[1]/div/a[3]");

    By streetNameLinkPath = By.xpath("/html/body/footer/div/div[4]/a[1]");
    By phoneNumberLinkPath = By.xpath("/html/body/footer/div/div[4]/a[2]");
    By eMailAddressLinkPath = By.xpath("/html/body/footer/div/div[4]/a[3]");

    public Footer(WebDriver driver) {

        this.browser = driver;
    }

    public WhatWeDo visitWhatWeDo() {

        browser.findElement(whatWeDoLinkPath).click();

        return new WhatWeDo(browser);
    }
    public WhatWeHaveDone visitWhatWeHaveDone() {

        browser.findElement(whatWeHaveDoneLinkPath).click();

        return new WhatWeHaveDone(browser);
    }
    public WorkForUs visitWorkForUs() {

        browser.findElement(workForUsLinkPath).click();

        return new WorkForUs(browser);
    }
    public RelevantPage visitRelevantPage() {

        browser.findElement(relevantLinkPath).click();

        return new RelevantPage(browser);
    }
    public AboutUs visitAboutUsPage() {

        browser.findElement(aboutUsLinkPath).click();

        return new AboutUs(browser);
    }
    public Contact visitContactPage() {

        browser.findElement(contactLinkPath).click();

        return new Contact(browser);
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
    public GoogleMaps goToAddress() {

        WebElement link = browser.findElement(streetNameLinkPath);
        String streetNameHref = link.getAttribute("href");
        browser.get(streetNameHref);

        return new GoogleMaps(browser);
    }
    public String getPhoneNumber() {

        return browser.findElement(phoneNumberLinkPath).getText();
    }

    public String getEmailAddress() {

        return browser.findElement(eMailAddressLinkPath).getText();
    }
}
