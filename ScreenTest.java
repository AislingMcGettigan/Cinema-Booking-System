

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ScreenTest.
 *
 * @Aisling McGettigan
 */
public class ScreenTest
{
    /**
     * Default constructor for test class ScreenTest
     */
    public ScreenTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetterMethod()
    {
        Screen screen1 = new Screen("Dirty Dancing", 40, 10, "5:00PM", 8.00, 10.00, 2, 12);
        assertEquals(12, screen1.getDay());
        assertEquals("Dirty Dancing", screen1.getFilmTitle());
        assertEquals(8.0, screen1.getPriceStandard(), 0.1);
        assertEquals(10.0, screen1.getPriceVIP(), 0.1);
        assertEquals(2, screen1.getScreen());
        assertEquals("5:00PM", screen1.getShowTime());
        assertEquals(40, screen1.getStandardSeating());
        assertEquals(10, screen1.getVipSeating());
    }

    @Test
    public void testSetterMethods()
    {
        Screen screen1 = new Screen("Dirty Dancing", 40, 10, "5:00PM", 8.00, 12.00, 2, 12);
        screen1.setDay(10);
        screen1.setFilmTitle("Star Wars 1");
        screen1.setPriceStandard(6.00);
        screen1.setPriceVIP(7.00);
        screen1.setScreen(5);
        screen1.setShowTime("11:00PM");
        screen1.setStandardSeating(35);
        screen1.setVipSeating(8);
    }
}


