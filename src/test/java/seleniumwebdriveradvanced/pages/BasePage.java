package seleniumwebdriveradvanced.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    WebDriver driver;
    protected final String BASE_URL = "https://the-internet.herokuapp.com";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void open();
}
