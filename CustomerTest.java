

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerTest.
 *
 * @Aisling Mcgettigan
 */
public class CustomerTest
{
    /**
     * Default constructor for test class CustomerTest
     */
    public CustomerTest()
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
    public void testCustomerName()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 1, 12, 2, 222, 12.00);
        assertEquals("Aisling McGettigan", customer1.getCustomerName());
    }

    @Test
    public void testPaymentMethod()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals("Cash", customer1.getPaymentMethod());
    }

    @Test
    public void testShowTime()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals("8:00PM", customer1.getShowTime());
    }

    @Test
    public void testFilmName()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
    }

    @Test
    public void testTicketType()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals("VIP", customer1.getTicketType());
    }

    @Test
    public void testScreen()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals(2, customer1.getScreen());
    }

    @Test
    public void testDay()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals(12, customer1.getDay());
    }

    @Test
    public void testNoT()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals("VIP", customer1.getTicketType());
        assertEquals(2, customer1.getNumberOfTickets());
    }

    @Test
    public void testFAI()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals(222, customer1.getFilmArrayID());
    }

    @Test
    public void testTicketPrice()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        assertEquals(12.0, customer1.getTicketPrice(), 0.1);
    }

    @Test
    public void testSetterMethods()
    {
        Customer customer1 = new Customer("Aisling McGettigan", "Cash", "Dirty Dancing", "8:00PM", "VIP", 2, 12, 2, 222, 12.00);
        customer1.setCustomerName("Cathal Diver");
        customer1.setDay(10);
        customer1.setFilmArrayID(223);
        customer1.setFilmName("Star Wars 1");
        customer1.setNumberOfTickets(3);
        customer1.setPaymentMethod("Credit Card");
        customer1.setScreen(4);
        customer1.setShowTime("5:00PM");
        customer1.setTicketPrice(8.00);
        customer1.setTicketType("Standard");
    }
}














