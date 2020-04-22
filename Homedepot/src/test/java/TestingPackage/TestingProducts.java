package TestingPackage;

import HomedepotPackage.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class TestingProducts extends Home
{



    @Test
    public void serchProducts() throws InterruptedException
    {
        List<String> list= Home.getPruducts();

        for(int i=0;i<list.size();i++)
        {
           driver.findElement(By.cssSelector("#headerSearch")).clear();

           driver.findElement(By.id("headerSearch")).sendKeys(list.get(i), Keys.ENTER);

           Thread.sleep(3000);
        }

    }




}
