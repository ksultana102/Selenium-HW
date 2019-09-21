package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestSearchEngine extends CommonAPI{
    @Test
    public void TestSearchEngine(){
        driver.findElement(By.cssSelector("//div[@class='search-icon hidden-xs hidden-sm']")).click();
        driver.findElement(By.xpath("//input[@id='edit-search-1']")).sendKeys("F train");
    }
}
