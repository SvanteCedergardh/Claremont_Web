package PageObjects;

import org.openqa.selenium.WebDriver;

public class WhatWeHaveDone {

    WebDriver browser;

    public WhatWeHaveDone(WebDriver driver) {

        this.browser = driver;
    }
    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
