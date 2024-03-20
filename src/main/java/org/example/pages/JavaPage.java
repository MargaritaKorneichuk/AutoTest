package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.utils.Locators;

public class JavaPage {

    private WebDriver browser;

    public JavaPage(WebDriver browser) {
        this.browser = browser;
    }
    public String getDescriptionJava() {
        WebElement textAboutJava = browser.findElement(Locators.JavaPage.ABOUT_PAGE);
        return textAboutJava.getText();
    }

    public AndroidPage clickAndroidButton() {
        WebElement androidButton = browser.findElement(Locators.JavaPage.ANDROID_BUTTON);
        androidButton.click();
        return new AndroidPage(browser);
    }

}
