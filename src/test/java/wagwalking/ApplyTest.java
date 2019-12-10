package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyTest extends BaseTest {


    @Test
    public void testApply() {

        HomePage homePage = new HomePage(driver);

        homePage.clickbookFirstWalkFreeButton();

        ApplyPage applyPage =new ApplyPage(driver);

//             applyPage.inputEmail("seattlevovka@gmail.com");
//              applyPage.inputPassword("vlko1981");
//               applyPage.inputfirstName("Vladimir");
//               applyPage.inputlastName("Kocharov");
//                applyPage.inputcellPhone("425-691-6140");

        ApplyPage applyPage2 = new ApplyPage(driver);

        applyPage2.inputEmail("vlad@hotmail.com");
        applyPage2.inputPassword("12345678");
        applyPage2.inputfirstName("Vlad");
        applyPage2.inputlastName("Petrov");
      //  applyPage2.inputCellphone("425-691-7889");

   //     applyPage2.clickEmail();
   //     applyPage2.clickPassword();
  //      applyPage2.clickfirstName();
   //     applyPage2.clicklastName();
   //     applyPage2.clickPhone();

  //      String email = applyPage2.getEmail();
  //      Assert.assertEquals("seattlevovka@gmail.com",email);

    }

    }


