package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestLibrary extends CommonAPI{
    @Test
    public void TestLibrary(){
        driver.findElement(By.xpath("//span[@class='title style-scope ytd-guide-entry-renderer'][contains(text(),'Library')]")).click();
    }
}
