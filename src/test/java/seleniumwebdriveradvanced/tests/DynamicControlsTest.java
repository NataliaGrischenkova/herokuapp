package seleniumwebdriveradvanced.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicControlsTest extends BaseTest {

    @Test
    void checkboxShouldDisappearAfterRemove() {

        dynamicControlsPage.open();
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.waitUntilMessage();

        assertEquals(dynamicControlsPage.getMessageText(), "It's gone!", "Текст сообщения неверный");
        assertTrue(dynamicControlsPage.checkboxIsNotPresent(), "Чекбокс должен исчезнуть, но он остался");
    }

    @Test
    void inputShouldBeEnabledAfterClickEnable() {

        dynamicControlsPage.open();

        assertTrue(dynamicControlsPage.inputIsDisabled(), "Input должен быть disabled при загрузке страницы");

        dynamicControlsPage.clickEnableButton();
        dynamicControlsPage.waitUntilMessage();

        assertEquals(dynamicControlsPage.getMessageText(), "It's enabled!", "Текст сообщения неверный");
        assertTrue(dynamicControlsPage.inputIsEnabled(), "Input должен стать enabled");
    }
}
