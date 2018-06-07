import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private By mobileMainMenu = By.cssSelector(".item_container>a[href = \"https://f.ua/shop/telefoniya/\"]");
    private By mobileSecondMenu = By.xpath("//*[@id=\"show_subcategory_262\"]/div/div[1]/a");
    private By field = By.id("head_search_input");
    private By searchButton = By.cssSelector(".btn.btn-right");


    public String getTitle(){
        String titleMainPage = driver.getTitle();
        return titleMainPage;
    }


    public void clickMobileCategory(){

        /*Actions actions = new Actions(driver);
        WebElement mobileElement = driver.findElement(mobileMainMenu);
        actions.moveToElement(mobileElement);
        actions.perform();*/

        driver.findElement(mobileMainMenu).click();
        driver.findElement(mobileSecondMenu).click();

    }

    public void searchSamsung(){
    driver.findElement(field).sendKeys("Samsung s9");
    driver.findElement(searchButton).click();
}





}
