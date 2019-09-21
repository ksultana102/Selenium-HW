package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestOneTrain extends CommonAPI{
    public void TestOneTrain(){
        driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')] ")).click();
        driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).getText();
    }
}
