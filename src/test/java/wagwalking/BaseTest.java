package wagwalking;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static Client client;

    protected static Client clienterror;

    protected static WebDriver driver;

    protected HomePage homePage;
    protected ApplyPage applyPage;
    protected LoginPage loginPage;

   @BeforeClass
  public static void start()  {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladimir\\Desktop\\chromedriver.exe");

      driver = new ChromeDriver();

      driver.manage().window().maximize();
      driver.get("https://wagwalking.com/");

      String actualTitle = driver.getTitle();
      System.out.println(actualTitle);

      String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

      Assert.assertEquals(expectedTitle, actualTitle);

      client = new Client("seattlevovka@gmail.com","vlko1981","Vladimir","Kocharov","425-691-6140");
      clienterror = new Client ( "34677","0","Kos","Voss","231");
   }



///  @AfterClass
 /// public static void finish(){
 // /    driver.quit();
 /// }




}
