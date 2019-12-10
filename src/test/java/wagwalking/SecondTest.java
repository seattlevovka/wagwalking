package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class SecondTest extends BaseTest {

    @Test
    public void testSecond(){



        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        inputFields.get(0).sendKeys("seattlevovka@gmail.com");

        inputFields.get(1).sendKeys("vlko1981");

        inputFields.get(2).sendKeys("Vladimir");

        inputFields.get(3).sendKeys("Kocharov");

        inputFields.get(4).sendKeys("425-691-6140");





    }

}
