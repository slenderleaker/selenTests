import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class firstHomeworkTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void driverStart() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void homeTest() {
        driver.get("http://ru.wikipedia.org");
        driver.findElement(By.className("mw-wiki-logo"));
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }


}
