package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoisturizersPage {
    private WebDriver driver;
    private By moisturizerPage = By.xpath("//h2[contains(text(),'Moisturizers')]");

    MoisturizersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkPage() {
        String moisturizerText = driver.findElement(moisturizerPage).getText();
        return moisturizerText;
    }
}
