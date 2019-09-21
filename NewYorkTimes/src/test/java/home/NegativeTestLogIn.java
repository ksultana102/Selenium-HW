package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class NegativeTestLogIn extends CommonAPI{
    @Test
    public void NegativeTestLogIn(){
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
        driver.findElement(By.id("email")).sendKeys("ksultana");
    }
}
