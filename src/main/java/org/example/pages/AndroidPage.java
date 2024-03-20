package org.example.pages;

import org.example.utils.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AndroidPage {
    private WebDriver browser;
    public AndroidPage(WebDriver browser) {
        this.browser = browser;
    }

    public AndroidPage clickChapter1Button(){
        WebElement link = browser.findElement(Locators.AndroidPage.START_BUTTON);
        link.click();
        return this;
    }
    public String getChapterName(){
        WebElement chapterName = browser.findElement(Locators.AndroidPage.CHAPTER_NAME);
        return chapterName.getText();
    }
    public String getArticleName(){
        WebElement articleName = browser.findElement(Locators.AndroidPage.ARTICLE_NAME);
        return articleName.getText();
    }
    public String getArticleLastChange(){
        WebElement lastChange = browser.findElement(Locators.AndroidPage.ARTICLE_LAST_CHANGE);
        return lastChange.getText();
    }
}
