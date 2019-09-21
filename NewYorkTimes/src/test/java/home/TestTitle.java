package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestTitle extends CommonAPI {
    @Test
    public void  TestTitle(){
        driver.findElement(By.xpath("/body/div[@id='app']/div/div[@class='css-1qr9tia e1suatyy0']/header[@class='css-ahe4g0 e1suatyy1']/div[@class='css-stscvm']/div[@class='css-158f1cv']/a[@class='css-118ydgp']/*[1] ")).click();
    }
}
