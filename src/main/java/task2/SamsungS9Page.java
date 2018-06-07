package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamsungS9Page {

    private WebDriver driver;

    //private By firstPhone = By.cssSelector("#item_5348662");
    private By firstPhone = By.xpath("//*[@id=\"item_5348662\"]/div/div/div[5]/a");

    public SamsungS9Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickFirstPhone(){
        driver.findElement(firstPhone).click();
        }


}
