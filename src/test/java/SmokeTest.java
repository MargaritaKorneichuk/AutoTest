import org.example.pages.AndroidPage;
import org.example.pages.JavaPage;
import org.example.utils.Locators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.pages.MainPage;

public class SmokeTest {
    private WebDriver browser;
    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://metanit.com/");
    }
    @Test
    public void checkDescriptionJava() {
        MainPage mainPage = new MainPage(browser);
        JavaPage javaPage=mainPage.clickJavaButton();
        String javaPageAbout=javaPage.getDescriptionJava();
        Assert.assertEquals(javaPageAbout,"Данный раздел посвящен языку программирования Java и всем сопутствующим технологиям. " +
                "Java на сегодняшний день являетсясамым популярным языком программирования, который позволяет создавать различные приложения широкого спектра: " +
                "веб-сайты и веб-сервисы, десктопные программы, мобильные приложения для ОС Андроид, современные приложения с богатым интерфейсом (Java FX). " +
                "Java - универсальный кроссплатформенный язык, поэтому приложения на Java будут работать на большинстве известных платформ как Windows, Linux, MacOS.");
    }
    @Test
    public void checkMainPageContent() {
        boolean isNavMenuDisplayed = browser.findElement(Locators.MainPage.NAV_MENU).isDisplayed();
        Assert.assertTrue( "Навигационное меню не отображается",isNavMenuDisplayed);
        boolean isMainMenuDisplayed = browser.findElement(Locators.MainPage.HEADER_NAV_MENU).isDisplayed();
        Assert.assertTrue("Главное мени не отображается",isMainMenuDisplayed);
    }

    @Test
    public void checkSocials(){
        WebElement telegramButton = browser.findElement(Locators.MainPage.TELEGRAM_BUTTON);
        telegramButton.click();
        String currentUrl = browser.getCurrentUrl();
        Assert.assertTrue("Кнопка не ведет на страницу Телеграм",currentUrl.contains("t.me/metanit"));
    }
    @Test
    public void checkArticleContent(){
        MainPage mainPage = new MainPage(browser);
        AndroidPage androidPage=mainPage
                .clickJavaButton()
                .clickAndroidButton()
                .clickChapter1Button();
        String chapterName= androidPage.getChapterName();
        Assert.assertEquals("Начало работы с Android",chapterName);
        String articleName= androidPage.getArticleName();
        Assert.assertEquals("Введение. Установка Android Studio и Android SDK",articleName);
        String lastChange= androidPage.getArticleLastChange();
        Assert.assertEquals("Последнее обновление: 27.11.2023",lastChange);
    }
    @After
    public void closeBrowser() {
        browser.quit();
    }
}