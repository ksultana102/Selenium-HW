package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestWorld extends CommonAPI{
   @Test
    public void TestWorld(){
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
    }
}
