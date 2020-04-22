package WalmartTestingPackage;

import WalmartHomePackage.WalmartHome;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleTesting extends WalmartHome
{

    @Test
    public void testTitle()
    {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        System.out.println(expectedTitle);

        String actualTitle = "Walmart.com | Save Money. Live Better.";
        System.out.println(actualTitle);

        softAssert.assertEquals( actualTitle,expectedTitle,"Title did not match. So you need to double check");
        softAssert.assertAll();
        System.out.println(actualTitle);
    }


}
