import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkboxTest() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        assertEquals(checkboxes.size(), 2);

        WebElement checkbox1 = checkboxes.get(0);
        WebElement checkbox2 = checkboxes.get(1);

        // Первый чекбокс должен быть не выбран, а после клика выбран
        assertFalse(checkbox1.isSelected(), "Чекбокс1 не выбран");

        checkbox1.click();

        assertTrue(checkbox1.isSelected(), "После клика Чекбокс1 выбран");

        // Второй чекбокс должен быть выбран, а после клика не быбран
        assertTrue(checkbox2.isSelected(), "Чекбокс2 выбран изначально");

        checkbox2.click();

        assertFalse(checkbox2.isSelected(), "После клика Чекбокс2 не выбран");
    }
}
