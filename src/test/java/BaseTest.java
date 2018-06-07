import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import task1.MobilePhonePage;
import task2.FirstPhonePage;
import task2.SamsungS9Page;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    MainPage mainPage;
    MobilePhonePage mobile;
    SamsungS9Page samsung;
    FirstPhonePage firstPhone;

    @BeforeClass
    public void init(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    mainPage = new MainPage(driver);
    mobile = new MobilePhonePage(driver);
    samsung = new SamsungS9Page(driver);
    firstPhone = new FirstPhonePage(driver);
    }

    @AfterClass
    public void stop(){
    driver.quit();
    }


}
