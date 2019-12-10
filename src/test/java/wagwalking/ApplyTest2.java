package wagwalking;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class ApplyTest2 extends BaseTest {

     public static Logger log = Logger.getLogger(ApplyTest2.class.getName());

    @Test
    public void test2Apply() {

        HomePage homePage = new HomePage(driver);

        homePage.clickbookFirstWalkFreeButton();

               ApplyPage applyPage =new ApplyPage(driver);

               applyPage.inputEmail("seattlevovka@gmail.com");
               applyPage.inputPassword("vlko1981");
               applyPage.inputfirstName("Vladimir");
               applyPage.inputlastName("Kocharov");
               applyPage.inputCellphone("(425) 691-6140");

                String email = applyPage.getEmail();
                Assert.assertEquals("seattlevovka@gmail.com",email);

                String firstName = applyPage.getfirstName();
                Assert.assertEquals("Vladimir",firstName);

                String lastName = applyPage.getlastName();
                Assert.assertEquals("Kocharov",lastName);

                String phone = applyPage.getphone();
                Assert.assertEquals("(425) 691-6140",phone);













    }
}
