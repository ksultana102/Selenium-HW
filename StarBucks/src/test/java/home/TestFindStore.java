package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestFindStore extends CommonAPI {
    @Test
    public void TestFindStore() {
        driver.findElement(By.xpath("//ul[@class='utility_list']//span[@class='hidden_visually med_render_visually'][contains(text(),'Find a Store')] ")).click();
        driver.findElement(By.xpath("//input[@placeholder='Find a store'] ")).click();
    }
}


