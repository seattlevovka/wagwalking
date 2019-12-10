package wagwalking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
     @FindBy(css=".sc-ifAKCX.yeXEn")
    private WebElement bookFirstWalkFreeButton;



    public ApplyPage clickbookFirstWalkFreeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(bookFirstWalkFreeButton));
     bookFirstWalkFreeButton.click();
     return new ApplyPage(driver); }




    @FindBy ( css= ".sc-ifAKCX.fHUled")
    private List<WebElement> topButtons;

    public LoginPage clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfAllElements(topButtons));
        topButtons.get(3).click();
        return new LoginPage(driver);

    }


     public LoginPage clickWagtagButton(){
         wait.until(ExpectedConditions.elementToBeClickable(topButtons.get(1)));
        topButtons.get(1).click();
        return new LoginPage(driver);
     }




}
