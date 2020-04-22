package HomedepotPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Home
{
    public WebDriver driver =null;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","/Users/juwel/Desktop/ALLJAR/geckodriver");
        driver= new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.homedepot.com");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }

    public static List<String> getPruducts()
    {
       List <String> list = new ArrayList<>();
       list.add("fan");
       list.add("ac");
       list.add("tree");
        return list;
    }




}
