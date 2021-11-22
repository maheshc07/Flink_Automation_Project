package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By temperatureValue = By.id("temperature");
    private By buyMoisturizers = By.xpath("//button[contains(text(),'Buy moisturizers')]");
    private By buySunscreens = By.xpath("//button[contains(text(),'Buy sunscreens')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public MoisturizersPage checkBelowTemperature() {
        String tempDegree = driver.findElement(temperatureValue).getText();
        clickLink("Buy moisturizers");
        System.out.println(tempDegree);
        return new MoisturizersPage(driver);

    }

    public SunscreensPage checkAboveTemperature() {
        String tempDegree = driver.findElement(temperatureValue).getText();
        clickLink("Buy sunscreens");
        System.out.println(tempDegree);
        return new SunscreensPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
