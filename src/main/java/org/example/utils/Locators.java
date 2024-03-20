package org.example.utils;

import org.openqa.selenium.By;
public interface Locators {
    public interface MainPage{
        By JAVA_BUTTON = By.xpath("//*[@class='navmenu']/a[5]");
        By NAV_MENU= By.xpath("//*[@class='navmenu']");
        By HEADER_NAV_MENU = By.xpath("//*[@class='mainmenu']");
        By TELEGRAM_BUTTON = By.xpath("//*[@class='socbtns']/ul/li[5]");
    }
    public interface JavaPage{
        By ABOUT_PAGE=By.xpath("//*[@class='centerRight']/p[1]");
        By ANDROID_BUTTON = By.xpath("//*[@class='navmenu']/a[2]");
    }
    public interface AndroidPage{
        By START_BUTTON=By.xpath("//*[@class='content']/li/p/a");
        By CHAPTER_NAME = By.xpath("//*[@class='item center menC']/h1");
        By ARTICLE_NAME = By.xpath("//*[@class='item center menC']/h2");
        By ARTICLE_LAST_CHANGE = By.xpath("//*[@class='date']");
    }
}
