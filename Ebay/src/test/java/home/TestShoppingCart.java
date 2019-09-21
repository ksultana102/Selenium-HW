package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart extends CommonAPI {
    @Test
    public void TestShoppingCart(){

        driver.findElement(By.xpath("//*[@class='gh-cart-icon']")).click();
       String text= driver.findElement(By.xpath("//span[contains(text(),\"You don't have any items in your cart.\")] ")).getText();
        System.out.println(text);
        Assert.assertEquals("You don't have any items in your cart.",text);
    }
}
