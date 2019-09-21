package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class NegativeTestLogIn extends CommonAPI  {
    @Test
    public void NegativeTestLogIn(){
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.id("username")).sendKeys("ksultana102");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.xpath("//button[@class='sb-frap']")).click();
    }
}
