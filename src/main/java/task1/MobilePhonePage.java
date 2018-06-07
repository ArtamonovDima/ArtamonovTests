package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MobilePhonePage {

    private WebDriver driver;
    List<WebElement> arr;

    public MobilePhonePage(WebDriver driver){
        this.driver = driver;
    }


    private By numberOfPhones = By.xpath("//div[@class = 'catalog_item_prop3x4 catalog_item']");


    public int numberOfPhones(){
      arr = driver.findElements(numberOfPhones);
      return arr.size();

    }



}
