package seleniumwebdriveradvanced.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    void fileShouldBeUploaded() {
        fileUploadPage.open();
        fileUploadPage.uploadFile("src/test/resources/flower.jpg");
        fileUploadPage.clickUploadButton();

        assertEquals(fileUploadPage.getUploadedFileName(), "flower.jpg", "Имя загруженного файла неверное");
    }
}
