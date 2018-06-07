package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPhonePage {

    private WebDriver driver;
    private By greyColor = By.cssSelector(".color>a[href=\"https://f.ua/samsung/galaxy-s9-g965f-ds-titanium-gray.html\"]");
    private By characteristics = By.cssSelector(".properties>a");
    private By secondCharacteristics = By.xpath("//span[text() = 'Все характеристики']");
    private By screenMaterial = By.xpath("//td[@class = 'value' and text() = 'Corning Gorilla Glass 5']");
    private By numberOfSim = By.cssSelector(".value>a[href=\"/shop/mobilnye-telefony/6147-kolichestvo-podderzhivaemyh-sim-kart_2/\"]");
    private By ourSystem = By.xpath("//td[@class = 'value' and text() = 'Android Oreo']");
    private By ourDiagonal = By.cssSelector(".value>a[href=\"/shop/mobilnye-telefony/8973-diagonal-displeya_6-1-i-bolee/\"]");

    public FirstPhonePage(WebDriver driver){
        this.driver = driver;
    }


    public void clickColor(){
        driver.findElement(greyColor).click();
    }

    public void clickCharacteristics(){
        driver.findElement(characteristics).click();
    }

    public void clickSecondCharacteristics(){
        driver.findElement(secondCharacteristics).click();
    }

    public String getScreenMaterial(){
        String material = driver.findElement(screenMaterial).getText();
        return material;
    }

    public String getNumberOfSim(){
        String number = driver.findElement(numberOfSim).getText();
        return number;
    }

    public String getSystem(){
        String system = driver.findElement(ourSystem).getText();
        return system;
    }

    public String getDiagonal(){
        String diagonal = driver.findElement(ourDiagonal).getText();
        return diagonal;
    }

    //tr.full.gray .value:contains('Corning Gorilla Glass 5')

}
