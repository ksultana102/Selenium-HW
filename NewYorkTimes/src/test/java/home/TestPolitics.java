package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestPolitics extends CommonAPI{
    @Test
    public void TestPolitics(){
        driver.findElement(By.xpath("//div[@class='css-1d8a290']//a[@class='css-1wjnrbv'][contains(text(),'Politics')]")).click();
    }
}
