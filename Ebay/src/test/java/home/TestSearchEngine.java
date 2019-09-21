package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestSearchEngine extends CommonAPI{
    @Test
    public void TestSearchEngine(){
        WebElement searchBox=driver.findElement(By.xpath("//div[@id='gh-ac-box2']"));
        Actions ac=new Actions(driver);
        ac.moveToElement(searchBox).click().build().perform();
        ac.moveToElement(searchBox).sendKeys("pencil").build().perform();
        driver.findElement(By.id("gh-btn")).click();
    }
}
