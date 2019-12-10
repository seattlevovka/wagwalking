package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyExistinguserTest extends BaseTest {

    @Test
    public void testApplyExistinguser() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.clickbookFirstWalkFreeButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail("alex@gmail.com");
  //      applyPage.inputPassword("v12345678");
        applyPage.inputfirstName("Vladimir");
        applyPage.inputlastName("Kocharov");
        applyPage.inputCellphone("425-691-6140");
        applyPage.clicknextButton();

  //      Thread.sleep(3000);

        String errormessage = applyPage.getemailRegistered();
        Assert.assertEquals("Email address already registered",errormessage);


    }

}
