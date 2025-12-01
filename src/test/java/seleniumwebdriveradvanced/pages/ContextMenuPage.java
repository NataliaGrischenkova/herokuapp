package seleniumwebdriveradvanced.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private static final By BOX = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(BASE_URL + "/context_menu");
    }

    public void rightClickBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(BOX)).perform();
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void closeAlert() {
        driver.switchTo().alert().accept();
    }
}
