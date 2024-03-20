package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.utils.Locators;

public class MainPage {
    private WebDriver browser;
    public MainPage(WebDriver browser) {
        this.browser = browser;
    }
    public JavaPage clickJavaButton() {
        WebElement javaButton = browser.findElement(Locators.MainPage.JAVA_BUTTON);
        javaButton.click();
        return new JavaPage(browser);
    }

}