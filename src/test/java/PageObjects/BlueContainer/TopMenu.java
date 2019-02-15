package PageObjects.BlueContainer;

import PageObjects.*;
import PageObjects.ThirdPartyLinkedPages.Facebook;
import PageObjects.ThirdPartyLinkedPages.GoogleMaps;
import PageObjects.ThirdPartyLinkedPages.Instagram;
import PageObjects.ThirdPartyLinkedPages.LinkedIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenu {

    WebDriver browser;

    By topMenuButtonLinkPath = By.xpath("//*[@id=\"app\"]/header/div[1]/button");

    By whatWeDoLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/ul/li[1]/h2/a");
    By whatWeHaveDoneLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/ul/li[2]/h2/a");
    By workForUsLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[1]/ul/li[3]/h2/a");

    By relevantLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[2]/ul/li[1]/a");
    By aboutUsLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[2]/ul/li[2]/a");
    By contactLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[2]/ul/li[3]/a");

    By instagramLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[5]/div/div/a[1]");
    By facebookLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[5]/div/div/a[2]");
    By linkedInLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[5]/div/div/a[3]");

    By streetNameLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[4]/a[1]");
    By phoneNumberLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[4]/a[2]");
    By eMailAddressLinkPath = By.xpath("//*[@id=\"app\"]/header/div[3]/div[4]/a[3]");

    public TopMenu(WebDriver driver) {

        this.browser = driver;
    }

    public void clickOnTopMenuButton() {

        browser.findElement(topMenuButtonLinkPath).click();
    }
    public WhatWeDo visitWhatWeDo() {

        WebElement link = browser.findElement(whatWeDoLinkPath);
        String wwdHref = link.getAttribute("href");
        browser.get(wwdHref);

        return new WhatWeDo(browser);
    }
    public WhatWeHaveDone visitWhatWeHaveDone() {

        WebElement link = browser.findElement(whatWeHaveDoneLinkPath);
        String wwhdHref = link.getAttribute("href");
        browser.get(wwhdHref);

        return new WhatWeHaveDone(browser);
    }
    public WorkForUs visitWorkForUs() {

        WebElement link = browser.findElement(workForUsLinkPath);
        String wfuHref = link.getAttribute("href");
        browser.get(wfuHref);

        return new WorkForUs(browser);
    }
    public RelevantPage visitRelevantPage() {

        WebElement link = browser.findElement(relevantLinkPath);
        String relevantHref = link.getAttribute("href");

        browser.get(relevantHref);

        return new RelevantPage(browser);
    }
    public AboutUs visitAboutUsPage() {

        WebElement link = browser.findElement(aboutUsLinkPath);
        String aboutUsHref = link.getAttribute("href");

        browser.get(aboutUsHref);

        return new AboutUs(browser);
    }
    public Contact visitContactPage() {

        WebElement link = browser.findElement(contactLinkPath);
        String contactHref = link.getAttribute("href");

        browser.get(contactHref);

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

        String[] phoneNum = browser.findElement(phoneNumberLinkPath).getAttribute("href").split(":");

        return phoneNum[1];
    }

    public String getEmailAddress() {

        String[] eMailAddress = browser.findElement(eMailAddressLinkPath).getAttribute("href").split(":");

        return eMailAddress[1];
    }

}
