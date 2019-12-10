package wagwalking;

import org.junit.Test;

public class WagtagPageTest extends BaseTest {

    @Test
    public void testWagtagPage() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);
        homePage.clickWagtagButton();



    }
}
