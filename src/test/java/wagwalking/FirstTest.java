package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst()  {



        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

       WebElement emailField=  driver.findElement(By.cssSelector("input[name=\"email\"]"));
       emailField.sendKeys(client.getEmail());

      WebElement passwordField=  driver.findElement(By.cssSelector("input[name=\"password\"]"));
      passwordField.sendKeys(client.getPassword());

      WebElement FirstNameField =driver.findElement(By.cssSelector("input[name=firstName]"));
      FirstNameField.sendKeys(client.getFirstName());

      WebElement LastNameField = driver.findElement(By.cssSelector("input[name=lastName]"));
      LastNameField.sendKeys(client.getLastName());

      WebElement PasswordField = driver.findElement(By.cssSelector("input[name=phone]"));

      PasswordField.sendKeys(client.getPhone());













    }
}
