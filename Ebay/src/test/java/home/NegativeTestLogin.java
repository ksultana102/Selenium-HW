package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class NegativeTestLogin extends CommonAPI {
    @Test
public void NegativeTestLogin(){
    driver.findElement(By.cssSelector("#gh-ug > a")).click();
    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ksultana102@gmail.com");
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("samia");
    driver.findElement(By.xpath("//button[@id='sgnBt']")).click();

}

}
