package sunscreens;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SunscreensPage;

import static org.testng.Assert.assertEquals;

public class SunscreensTests extends BaseTests {

    @Test
    public void testTemperatureValue() {
        SunscreensPage sunscreensPage = homePage.checkAboveTemperature();
        assertEquals(sunscreensPage.checkPage(),"Sunscreens");
    }
}
