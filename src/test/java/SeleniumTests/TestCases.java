package SeleniumTests;

import PageObjects.*;
import PageObjects.BlueContainer.Footer;
import PageObjects.BlueContainer.TopMenu;
import PageObjects.ThirdPartyLinkedPages.Facebook;
import PageObjects.ThirdPartyLinkedPages.GoogleMaps;
import PageObjects.ThirdPartyLinkedPages.Instagram;
import PageObjects.ThirdPartyLinkedPages.LinkedIn;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCases {

    WebDriver browser;

    private String homePageUrl = "https://www.claremont.se/";
    private String searchResultsUrl = "Sök - Claremont";
    private String whatWeDoPageUrl = "https://www.claremont.se/vad-vi-gor/";
    private String whatWeHaveDonePageUrl = "https://www.claremont.se/vad-vi-gjort/";
    private String workForUsPageUrl = "https://www.claremont.se/jobba-hos-oss/";
    private String relevantPageUrl = "https://www.claremont.se/aktuellt/";
    private String aboutUsPageUrl = "https://www.claremont.se/om-oss/";
    private String contactPageUrl = "https://www.claremont.se/kontakt/";

    private String instagramPage = "https://www.instagram.com/claremont_se/";
    private String facebookPage = "https://www.facebook.com/ClaremontSverige";
    private String linkedInTitle = "LinkedIn: Log In or Sign Up";

    private String googleMapsTitle = "Birger Jarlsgatan 7 - Google Maps";
    private String visiblePhoneNumber = "08-406 68 00";
    private String visibleEmailAddress = "info@claremont.se";

    @Before
    public void setUp() {

        browser = new ChromeDriver();
        browser.get("http://www.claremont.se");

        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {

        browser.quit();
    }
    @Test
    public void getPageUrl() {

        Assert.assertEquals(homePageUrl, browser.getCurrentUrl());
    }
    @Test
    public void searchWithoutInput() {

        StartPage startPage = new StartPage(browser);
        SearchResults searchPage = startPage.getSearchResults(false);

        Assert.assertEquals(searchResultsUrl, searchPage.getPageTitle());
    }
    @Test
    public void searchWithInput() {

        StartPage startPage = new StartPage(browser);
        SearchResults searchPage = startPage.getSearchResults(true);

        Assert.assertEquals(searchResultsUrl, searchPage.getPageTitle());
    }
    @Test
    public void clickOnWhatWeDoLinkInFooter() {

        Footer footer = new Footer(browser);
        WhatWeDo wwdPage = footer.visitWhatWeDo();

        Assert.assertEquals(whatWeDoPageUrl, wwdPage.getPageUrl());
    }
    @Test
    public void clickOnWhatWeHaveDoneLinkInFooter() {

        Footer footer = new Footer(browser);
        WhatWeHaveDone wwhdPage = footer.visitWhatWeHaveDone();

        Assert.assertEquals(whatWeHaveDonePageUrl, wwhdPage.getPageUrl());
    }
    @Test
    public void clickOnWorkForUsLinkInFooter() {

        Footer footer = new Footer(browser);
        WorkForUs wfuPage = footer.visitWorkForUs();

        Assert.assertEquals(workForUsPageUrl, wfuPage.getPageUrl());
    }
    @Test
    public void clickOnRelevantLinkInFooter() {

        Footer footer = new Footer(browser);
        RelevantPage relevantPage = footer.visitRelevantPage();

        Assert.assertEquals(relevantPageUrl, relevantPage.getPageUrl());
    }
    @Test
    public void clickOnAboutUsLinkInFooter() {

        Footer footer = new Footer(browser);
        AboutUs aboutUsPage = footer.visitAboutUsPage();

        Assert.assertEquals(aboutUsPageUrl, aboutUsPage.getPageUrl());
    }
    @Test
    public void clickOnContactLinkInFooter() {

        Footer footer = new Footer(browser);
        Contact contactPage = footer.visitContactPage();

        Assert.assertEquals(contactPageUrl, contactPage.getPageUrl());
    }
    @Test
    public void clickOnInstagramLinkInFooter() {

        Footer footer = new Footer(browser);
        Instagram instagram = footer.visitInstagram();

        Assert.assertEquals(instagramPage, instagram.getPageUrl());
    }
    @Test
    public void clickOnFacebookLinkInFooter() {

        Footer footer = new Footer(browser);
        Facebook facebook = footer.visitFacebook();

        Assert.assertEquals(facebookPage, facebook.getPageUrl());
    }
    @Test
    public void clickOnLinkedInLinkInFooter() {

        Footer footer = new Footer(browser);
        LinkedIn linkedIn = footer.visitLinkedIn();

        Assert.assertEquals(linkedInTitle, linkedIn.getPageTitle());
    }
    @Test
    public void clickOnAddressInFooter() {

        Footer footer = new Footer(browser);
        GoogleMaps googleMapsPage = footer.goToAddress();

        Assert.assertEquals(googleMapsTitle, googleMapsPage.getPageTitle());
    }
    @Test
    public void checkPhoneNumberInFooter() {

        Footer footer = new Footer(browser);

        Assert.assertEquals(visiblePhoneNumber, footer.getPhoneNumber());
    }
    @Test
    public void checkMailAddressInFooter() {

        Footer footer = new Footer(browser);

        Assert.assertEquals(visibleEmailAddress, footer.getEmailAddress());
    }
    @Test
    public void clickOnWhatWeDoLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        WhatWeDo wwdPage = topMenu.visitWhatWeDo();

        Assert.assertEquals(whatWeDoPageUrl, wwdPage.getPageUrl());
    }
    @Test
    public void clickOnWhatWeHaveDoneLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        WhatWeHaveDone wwhdPage = topMenu.visitWhatWeHaveDone();

        Assert.assertEquals(whatWeHaveDonePageUrl, wwhdPage.getPageUrl());
    }
    @Test
    public void clickOnWorkForUsLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        WorkForUs wfuPage = topMenu.visitWorkForUs();

        Assert.assertEquals(workForUsPageUrl, wfuPage.getPageUrl());
    }
    @Test
    public void clickOnRelevantLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        RelevantPage relevantPage = topMenu.visitRelevantPage();

        Assert.assertEquals(relevantPageUrl, relevantPage.getPageUrl());
    }
    @Test
    public void clickOnAboutUsLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        AboutUs aboutUsPage = topMenu.visitAboutUsPage();

        Assert.assertEquals(aboutUsPageUrl, aboutUsPage.getPageUrl());
    }
    @Test
    public void clickOnContactLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        Contact contactPage = topMenu.visitContactPage();

        Assert.assertEquals(contactPageUrl, contactPage.getPageUrl());
    }
    @Test
    public void clickOnInstagramLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        Instagram instagram = topMenu.visitInstagram();

        Assert.assertEquals(instagramPage, instagram.getPageUrl());
    }
    @Test
    public void clickOnFacebookLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        Facebook facebook = topMenu.visitFacebook();

        Assert.assertEquals(facebookPage, facebook.getPageUrl());
    }
    @Test
    public void clickOnLinkedInLinkInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        LinkedIn linkedIn = topMenu.visitLinkedIn();

        Assert.assertEquals(linkedInTitle, linkedIn.getPageTitle());
    }
    @Test
    public void clickOnAddressInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();
        GoogleMaps googleMapsPage = topMenu.goToAddress();

        Assert.assertEquals(googleMapsTitle, googleMapsPage.getPageTitle());
    }
    @Test
    public void checkPhoneNumberInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();

        Assert.assertEquals(visiblePhoneNumber, topMenu.getPhoneNumber());
    }
    @Test
    public void checkMailAddressInTopMenu() {

        TopMenu topMenu = new TopMenu(browser);
        topMenu.clickOnTopMenuButton();

        Assert.assertEquals(visibleEmailAddress, topMenu.getEmailAddress());
    }
}
