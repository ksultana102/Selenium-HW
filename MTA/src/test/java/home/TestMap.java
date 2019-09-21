package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestMap extends CommonAPI{
    @Test
    public void TestMap(){
        driver.findElement(By.xpath("//a[contains(text(),'Maps')]")).click();

    }
}
