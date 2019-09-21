package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestTrending extends CommonAPI{
    @Test
    public void TestTrending(){
        driver.findElement(By.xpath("//span[@class='title style-scope ytd-guide-entry-renderer'][contains(text(),'Trending')]")).click();
    }
}
