
/**
 * Class Customer
 *
 * @Aisling Mcgettigan
 * 
 */
public class Customer
{
    //instance variables declared
    private String customerName;
    private String paymentMethod;
    private String filmName;
    private String showTime;
    private String ticketType;
    private int screen;
    private int day;
    private int numberOfTickets;
    private int filmArrayID;
    private double ticketCost;

    //Constructor for objects of class Customer
    public Customer(String cn, String pm, String fn,String st, String tt, int sc, int dy, int not, int fai, double tc)
    {
        customerName = cn;
        paymentMethod= pm;
        filmName = fn;
        showTime = st;
        ticketType = tt;
        screen = sc;
        day = dy;
        numberOfTickets = not;
        filmArrayID = fai;
        ticketCost = tc;
    }

   //getter methods for class customer
    public String getCustomerName()
    {
        return this.customerName;
    }
    
    public String getPaymentMethod()
    {
        return this.paymentMethod;
    }
    
    public String getFilmName()
    {
        return this.filmName;
    }
    
    public String getShowTime()
    {
        return this.showTime;
    }
    
    public String getTicketType()
    {
        return this.ticketType;
    }
    
    public int getScreen()
    {
        return this.screen;
    }
    
    public int getDay()
    {
        return this.day;
    }
    
    public int getNumberOfTickets()
    {
        return this.numberOfTickets;
    }
    
    public int getFilmArrayID()
    {
        return this.filmArrayID;
    }
    
    public double getTicketPrice()
    {
        return this.ticketCost;
    }
    
    //setter methods for class customer
    public void setCustomerName(String value)
    {
         this.customerName = value;
    }
    
    public void setPaymentMethod(String value)
    {
         this.paymentMethod = value;
    }
    
    public void setFilmName(String value)
    {
         this.filmName = value;
    }
    
    public void setShowTime(String value)
    {
         this.showTime = value;
    }
    
    public void setTicketType(String value)
    {
         this.ticketType = value;
    }
    
    public void setScreen(int value)
    {
         this.screen = value;
    }
    
    public void setDay(int value)
    {
         this.day = value;
    }
    
    public void setNumberOfTickets(int value)
    {
         this.numberOfTickets = value;
    }
    
    public void setFilmArrayID(int value)
    {
         this.filmArrayID = value;
    }
    
    public void setTicketPrice(double value)
    {
         this.ticketCost = value;
    }
    
    //toString Method
    public String toString() 
    {
        return "Customer Name = " + customerName + "\nFilm = " + filmName + "\nScreen = " 
            + screen + "\nShow Time = " + showTime + "\nTicket Type = " 
            + ticketType + "\nPayment Method = " + paymentMethod
            + "\nDay = " + day + "\nNumber of Tickets Bought = " + numberOfTickets;
    }
}


