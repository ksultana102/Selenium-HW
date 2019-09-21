package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestAccount extends CommonAPI{
    @Test
    public void TestAccount(){
        driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-icon[@class='style-scope ytd-button-renderer']")).click();
    }
}
