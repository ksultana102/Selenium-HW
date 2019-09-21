package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchEngine extends CommonAPI{
    @Test
    public void TestSearchEngine(){
        driver.findElement(By.xpath("//input[@id='search']")).click();
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("katy perry");

    }
}
