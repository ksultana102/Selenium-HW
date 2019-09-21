package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestMoreDropDownMenu extends CommonAPI{
    @Test
    public void TestMoreDropDownMenu (){
        driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).getText();
    }
}
