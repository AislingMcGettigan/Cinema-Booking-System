

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RatingTest.
 *
 * @Aisling McGettigan
 */
public class RatingTest
{
    /**
     * Default constructor for test class RatingTest
     */
    public RatingTest()
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
    public void testGetterMethods()
    {
        Rating rating1 = new Rating("Dirty Dancing", 5);
        assertEquals("Dirty Dancing", rating1.getFilmName());
        assertEquals(5, rating1.getNumericalRating());
    }

    @Test
    public void testSetterMethods()
    {
        Rating rating1 = new Rating("Dirty Dancing", 5);
        rating1.setFilmName("Star Wars 1");
        rating1.setNumericalRating(3);
    }
}


