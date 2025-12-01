package seleniumwebdriveradvanced.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class FramesPage extends BasePage {

    private static final By IFRAME_LINK = By.linkText("iFrame");
    private static final By IFRAME = By.id("mce_0_ifr");
    private static final By PARAGRAPH = By.id("tinymce");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(BASE_URL + "/frames");
    }

    public void openIFrame() {
        driver.findElement(IFRAME_LINK).click();
    }

    public String getParagraphText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IFRAME));
        String text = driver.findElement(PARAGRAPH).getText();
        return text;
    }
}
