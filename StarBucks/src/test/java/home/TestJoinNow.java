package home;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class TestJoinNow extends CommonAPI {
   @Test
    public void TestJoinNow(){
        driver.findElement(By.xpath("//a[contains(text(),'Join now')]")).click();
        driver.findElement(By.xpath("//a[@class='sb-button sb-button--default sb-button--white flex-shrink-none ml6 self-center']")).click();
    }
}
