package seleniumwebdriveradvanced.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DynamicControlsPage extends BasePage {

    private static final By REMOVE_BUTTON = By.xpath("//button[text()='Remove']");
    private static final By ADD_BUTTON = By.xpath("//button[text()='Add']");
    private static final By CHECKBOX = By.cssSelector("#checkbox input[type='checkbox']");
    private static final By MESSAGE = By.cssSelector("#message");
    private static final By ENABLE_BUTTON = By.xpath("//button[text()='Enable']");
    private static final By INPUT = By.xpath("//input[@type='text']");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(BASE_URL + "/dynamic_controls");
    }

    public void clickRemoveButton() {
        driver.findElement(REMOVE_BUTTON).click();
    }

    public void clickAddButton() {
        driver.findElement(ADD_BUTTON).click();
    }

    public void clickEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
    }

    public boolean waitUntilMessage () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
        return wait.until(ExpectedConditions
                .visibilityOfElementLocated(MESSAGE))
                .isDisplayed();
    }

    public String getMessageText() {
        return driver.findElement(MESSAGE).getText();
    }

    public boolean checkboxIsNotPresent() {
        return driver.findElements(CHECKBOX).isEmpty();
    }

    public boolean inputIsDisabled() {
        WebElement input = driver.findElement(INPUT);
        return !input.isEnabled();
    }

    public boolean inputIsEnabled() {
        WebElement input = driver.findElement(INPUT);
        return input.isEnabled();
    }
}
