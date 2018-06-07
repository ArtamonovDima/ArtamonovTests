import org.testng.Assert;
import org.testng.annotations.Test;
import task1.MobilePhonePage;

public class TestClass extends BaseTest{

    @Test
    public void task1Method(){

        driver.get("https://f.ua/");
        Assert.assertEquals("F.ua《Тот Самый》― ИНТЕРНЕТ МАГАЗИН", driver.getTitle());

        mainPage.clickMobileCategory();

        Assert.assertEquals(36, mobile.numberOfPhones());

        }

    @Test
    public void task2Method(){

        driver.get("https://f.ua/");
        Assert.assertEquals("F.ua《Тот Самый》― ИНТЕРНЕТ МАГАЗИН", driver.getTitle());

        mainPage.searchSamsung();
        samsung.clickFirstPhone();
        firstPhone.clickColor();
        firstPhone.clickCharacteristics();
        firstPhone.clickSecondCharacteristics();
        Assert.assertEquals("2 sim",firstPhone.getNumberOfSim() );
        Assert.assertNotEquals("7", firstPhone.getDiagonal()  );
        Assert.assertEquals("Corning Gorilla Glass 5", firstPhone.getScreenMaterial() );
        Assert.assertEquals("Android Oreo", firstPhone.getSystem() );

        }

}
