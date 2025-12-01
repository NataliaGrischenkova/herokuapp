package seleniumwebdriveradvanced.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import seleniumwebdriveradvanced.pages.ContextMenuPage;
import seleniumwebdriveradvanced.pages.DynamicControlsPage;
import seleniumwebdriveradvanced.pages.FileUploadPage;
import seleniumwebdriveradvanced.pages.FramesPage;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class BaseTest {

    public WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FileUploadPage fileUploadPage;
    FramesPage framesPage;

    @BeforeMethod
    public void setUP() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--incognito");
        options.addArguments("--start-maximizer");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.of(5, SECONDS));

        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
