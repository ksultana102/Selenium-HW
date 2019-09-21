package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestCoffeeDropDownMenu extends CommonAPI {
    @Test
    public void TestCoffeeDropDownMenu(){
        driver.findElement(By.xpath(" //li[@id='nav_coffee']//strong[contains(text(),'Coffee')] ")).click();

    }
}
