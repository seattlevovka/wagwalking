package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThirdTest extends BaseTest {

    @Test
    public void testThird() {


        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        inputFields.get(0).click();

        inputFields.get(1).click();

        inputFields.get(2).click();

        inputFields.get(3).click();

        inputFields.get(4).click();

        inputFields.get(0).click();


        List<WebElement> clickFields = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));



        String emailError = clickFields.get(0).getText();
        String expEmailError = "required";
        Assert.assertEquals(expEmailError,emailError);

   //     String passwordError = clickFields.get(1).getText();
   //    String exppasswordError= "required";
   //     Assert.assertEquals(exppasswordError,passwordError);

        String FirstNameInputError = clickFields.get(1).getText();
        String expFirstNameInputError = "required";
        Assert.assertEquals(expFirstNameInputError,FirstNameInputError);

        String LastNameInputError = clickFields.get(2).getText();
        String expLastNameInputError = "required";
        Assert.assertEquals(expLastNameInputError,LastNameInputError);

        String cellPhoneError = clickFields.get(3).getText();
        String expcellPhoneError = "required";
        Assert.assertEquals(expcellPhoneError,cellPhoneError);

    }


}
