package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestShopByCategory extends CommonAPI{
    @Test
    public void TestShopByCategory(){
        driver.findElement(By.id("gh-shop-ei")).click();

    }
}
