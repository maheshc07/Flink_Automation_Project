package moisturizers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MoisturizersPage;

import static org.testng.Assert.assertEquals;

public class MoisturizersTests extends BaseTests {

    @Test
    public void testTemperatureValue() {
        MoisturizersPage moisturizerPage = homePage.checkBelowTemperature();
        assertEquals(moisturizerPage.checkPage(),"Moisturizers");
    }
}
