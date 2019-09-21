package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class NegativeTestLogin extends CommonAPI {
    @Test
    public void NegativeTestLogin(){
        driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-icon[@class='style-scope ytd-button-renderer']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("345");
    }
}
