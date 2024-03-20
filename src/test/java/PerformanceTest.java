import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class PerformanceTest {
    private WebDriver browser;
    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }
    @Test
    public void measurePageLoadTime() {
        long startTime = System.currentTimeMillis();
        browser.get("https://metanit.com/");
        long endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        startTime=System.currentTimeMillis();
        browser.get("https://metanit.com/java/");
        endTime = System.currentTimeMillis();
        long loadTimeJava = endTime-startTime;
        assertTrue( "Время загрузки страницы превышает 4 секунды",loadTime < 4000 && loadTimeJava < 4000);
    }
    @After
    public void closeBrowser() {
        browser.quit();
    }
}
