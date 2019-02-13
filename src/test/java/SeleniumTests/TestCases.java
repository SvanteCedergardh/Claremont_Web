package SeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCases {

    WebDriver browser;

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
    public void checkSum() {

    }
}
