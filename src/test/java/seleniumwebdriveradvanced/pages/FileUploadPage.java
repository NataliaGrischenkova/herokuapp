package seleniumwebdriveradvanced.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage extends BasePage {

    private static final By UPLOAD_INPUT = By.id("file-upload");
    private static final By UPLOAD_BUTTON = By.id("file-submit");
    private static final By FILE_NAME_TEXT = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(BASE_URL + "/upload");
    }

    public void uploadFile(String filePath) {
        File file = new File("src/test/resources/flower.jpg");
        driver.findElement(UPLOAD_INPUT).sendKeys(file.getAbsolutePath());
    }

    public void clickUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(FILE_NAME_TEXT).getText();
    }
}
