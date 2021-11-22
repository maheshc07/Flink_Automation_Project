package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SunscreensPage {
    private WebDriver driver;
    private By sunscreensPage = By.xpath("//h2[contains(text(),'Sunscreens')]");

    SunscreensPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkPage() {
        String sunscreensText = driver.findElement(sunscreensPage).getText();
        return sunscreensText;
    }
}
