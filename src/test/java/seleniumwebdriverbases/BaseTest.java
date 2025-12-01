package seleniumwebdriverbases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUP() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--incognito");
        options.addArguments("--start-maximizer");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.of(5, SECONDS));

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}