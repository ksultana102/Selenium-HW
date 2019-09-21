package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestExcitingUpdates extends CommonAPI {
    @Test
    public void TestExcitingUpdates(){
        driver.findElement(By.xpath("//span[@class='pagetop_cta']")).click();
       String text1= driver.findElement(By.xpath("//h2[@class='sb-heading sb-heading--large Iy02AWybBdHLCrcCKMfNw _19DS47ZrsxoTI6ZnzZZ1hB']")).getText();
        System.out.println(text1);
        Assert.assertEquals("Signing up is easy and fast",text1);

    }
}