package PageObjects;

import org.openqa.selenium.WebDriver;

public class WhatWeDo {

    WebDriver browser;

    public WhatWeDo(WebDriver driver) {

        this.browser = driver;
    }

    public String getPageUrl() {

        return browser.getCurrentUrl();
    }
}
