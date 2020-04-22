package WalmartHomePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WalmartHome
{

   public WebDriver driver =null;

   @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","/Users/juwel/Desktop/ALLJAR/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.walmart.com");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }

}
