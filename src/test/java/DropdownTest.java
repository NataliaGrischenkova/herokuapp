import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {

    @Test
    public void dropdownSelectTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // Найти dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        // Проверить, что написано: Please select an option
        WebElement defaultOption = select.getFirstSelectedOption();
        assertEquals(defaultOption.getText(), "Please select an option");

        // Выбрать Option1, проверяем что выбралось.
        select.selectByVisibleText("Option 1");

        WebElement option1 = select.getFirstSelectedOption();
        assertEquals(option1.getText(), "Option 1");


        // Выбрать Option2, проверить что выбралось.
        select.selectByVisibleText("Option 2");

        WebElement option2 =  select.getFirstSelectedOption();
        assertEquals(option2.getText(), "Option 2");
    }
}
