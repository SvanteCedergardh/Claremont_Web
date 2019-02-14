package SeleniumTests;

import PageObjects.Footer;
import PageObjects.SocialMediaPages.Facebook;
import PageObjects.SocialMediaPages.Instagram;
import PageObjects.SocialMediaPages.LinkedIn;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCases {

    WebDriver browser;

    private String homePageUrl = "https://www.claremont.se/";
    private String searchInput = "Test";
    private String pageTitle = "Claremont l Consulting made personal - Claremont";
    private String instagramPage = "https://www.instagram.com/claremont_se/";
    private String facebookPage = "https://www.facebook.com/ClaremontSverige";
    private String linkedInTitle = "LinkedIn: Log In or Sign Up";

    By searchButtonPath = By.className("search");
    By searchResultButtonPath = By.xpath("//*[@id=\"app\"]/header/div[2]/div/form/fieldset/input[2]");

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
    public void verifyPage() {

        Assert.assertEquals(homePageUrl, browser.getCurrentUrl());
    }
    @Test
    public void searchWithoutInput() {

        browser.findElement(searchButtonPath).click();
        browser.findElement(searchResultButtonPath).sendKeys(Keys.ENTER);

        Assert.assertEquals(pageTitle, browser.getTitle());
    }
    @Test
    public void searchWithInput() {

        browser.findElement(searchButtonPath).click();
        browser.findElement(searchResultButtonPath).sendKeys(searchInput);

        Assert.assertEquals(pageTitle, browser.getTitle());
    }
    /*
    @Test
    public void clickOnWhatWeDoLinkInFooter() {

    }
    @Test
    public void clickOnWhatWeHaveDoneLinkInFooter() {

    }
    @Test
    public void clickOnWorkWithUsLinkInFooter() {

    }
    @Test
    public void clickOnCurrentLinkInFooter() {

    }
    @Test
    public void clickOnAboutUsLinkInFooter() {

    }
    @Test
    public void clickOnContactLinkInFooter() {

    }
    */
    @Test
    public void clickOnInstagramLinkInFooter() {

        Footer footer = new Footer(browser);
        Instagram instagram = footer.visitInstagram();

        Assert.assertEquals(instagramPage, instagram.verifyPage());
    }
    @Test
    public void clickOnFacebookLinkInFooter() {

        Footer footer = new Footer(browser);
        Facebook facebook = footer.visitFacebook();

        Assert.assertEquals(facebookPage, facebook.verifyPage());
    }
    @Test
    public void clickOnLinkedInLinkInFooter() {

        Footer footer = new Footer(browser);
        LinkedIn linkedIn = footer.visitLinkedIn();

        Assert.assertEquals(linkedInTitle, linkedIn.verifyPage());
    }
}
