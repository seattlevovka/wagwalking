package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForthTest extends BaseTest {
    @Test

    public void testForth (){

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();



        WebElement emailField=  driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys(clienterror.getEmail());

        WebElement passwordField=  driver.findElement(By.cssSelector("input[name=\"password\"]"));
        passwordField.sendKeys(clienterror.getPassword());

        WebElement FirstNameField =driver.findElement(By.cssSelector("input[name=firstName]"));
        FirstNameField.sendKeys(clienterror.getFirstName());

        WebElement LastNameField = driver.findElement(By.cssSelector("input[name=lastName]"));
        LastNameField.sendKeys(clienterror.getLastName());

        WebElement PasswordField = driver.findElement(By.cssSelector("input[name=phone]"));
        PasswordField.sendKeys(clienterror.getPhone());


        WebElement emailError = driver.findElement(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));
        String expEmailError = "please provide a valid email";
        Assert.assertEquals(expEmailError,emailError);

        WebElement passwordcharError = driver.findElement(By.cssSelector(".sc-gzVnrw.fzplxK"));
        String expPasswordcharError ="(8 Characters,";
        Assert.assertEquals(expPasswordcharError,passwordcharError);

        WebElement passwordletterError = driver.findElement(By.cssSelector(".sc-gzVnrw.fzplxK"));
        String expPasswordletterError = "1 Letter,";
        Assert.assertEquals(expPasswordletterError,passwordletterError);

        WebElement passwordnumberError = driver.findElement(By.cssSelector(".sc-gzVnrw.kAmxEC"));
        String expPasswordnumberError = "1 Number)";
        Assert.assertEquals(expPasswordnumberError,passwordnumberError);

        WebElement cellphoneError = driver.findElement(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));
        String expCellphoneError = "please enter a valid phone number";
        Assert.assertEquals(expCellphoneError,cellphoneError);






    }












}
