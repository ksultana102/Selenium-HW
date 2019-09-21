package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
public class CommonAPI {
    public static WebDriver driver=null;
    //
    @BeforeMethod
    @Parameters({"url"})
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Samia\\IdeaProjects\\WebAutomationFrameworkSetUp\\Generic\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        //driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS );
        driver.get(url);

    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}