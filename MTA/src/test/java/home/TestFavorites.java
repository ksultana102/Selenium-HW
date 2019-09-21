package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestFavorites extends CommonAPI{
    @Test
    public void TestFavorites(){
        driver.findElement(By.cssSelector("#button-favorites")).click();
        driver.findElement(By.xpath("//button[@class='button modal-favorites secondary-light-button'] ")).click();

    }
}
