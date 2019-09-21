package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestNotifications extends CommonAPI {
    @Test
    public void TestNotifications(){
        driver.findElement(By.id("gh-Alerts-i")).click();
    }
}
