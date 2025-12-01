package seleniumwebdriveradvanced.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    void rightClickShouldShowAlert() {
        contextMenuPage.open();
        contextMenuPage.rightClickBox();
        String alertText = contextMenuPage.getAlertText();

        Assert.assertEquals(alertText, "You selected a context menu");

        contextMenuPage.closeAlert();
    }
}
