package wagwalking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver){
        super(driver);
    }
    @FindBy( css = "input[name=\"email\"]")
    private WebElement emailField;

    @FindBy( css = "input[name=\"password\"]")
    private WebElement passwordField;

    @FindBy ( css = "input[name=firstName]")
    private WebElement firstNameField;

    @FindBy( css = "input[name=lastName] ")
    private WebElement lastNameField;

    @FindBy( css = "input[name=phone]")
    private WebElement cellPhoneField;

    @FindBy ( css = "input")
    private List<WebElement> inputFields;

     public void inputEmail1(String email){
     emailField.sendKeys(email); }


    public void inputPassword1(String password){
    passwordField.sendKeys(password); }





    public void inputEmail( String email){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields));
        inputFields.get(0).sendKeys(email); }

    public void inputPassword( String password)
    {    inputFields.get(1).sendKeys(password);}

    public void inputfirstName( String firstName){
        inputFields.get(2).sendKeys(firstName);
    }

    public void inputlastName( String lastName){
        inputFields.get(3).sendKeys(lastName);
    }
    public void inputCellphone( String cellPhone){
        inputFields.get(4).sendKeys(cellPhone);
    }

    public String getEmail(){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(0)));
       String email= inputFields.get(0).getAttribute("value");
       return email;
    }

    public String getfirstName(){
        String firstName=inputFields.get(2).getAttribute("value");
        return firstName;
    }

    public String getlastName(){
        String lastName = inputFields.get(3).getAttribute("value");
        return lastName;
    }

    public String getphone(){
        String phone = inputFields.get(4).getAttribute("value");
        return phone;
    }


    public void clickEmail(){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields));
        inputFields.get(0).click();
    }

    public void clickPassword(){
        inputFields.get(1).click();
    }

    public void clickfirstName(){
        inputFields.get(2).click();
    }

    public void clicklastName(){
        inputFields.get(3).click();
    }
    public void clickPhone(){
        inputFields.get(4).click();
    }


    @FindBy( css=".sc-htoDjs.hdXrdX")
    private WebElement nextButton;

    public void clicknextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();}



        @FindBy (css =".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement emailRegistered;

    public String getemailRegistered(){
        wait.until(ExpectedConditions.visibilityOf(emailRegistered));
        return emailRegistered.getText();

    }
      @FindBy (css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
      private List<WebElement> errorFields;

      private void inputerrorEmail(){
          errorFields.get(0).click();
      }

      private void inputerrorfirstName(){
          errorFields.get(1).click();
      }

      private void inputerrorlastName(){
          errorFields.get(2).click();
      }

      private void inputerrorPhone(){
        errorFields.get(3).click();
      }



}
