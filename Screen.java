
/** Class Screen
 *
 * @author: aisling mcgettigan
 */
public class Screen
{
    public String filmTitle;
    public int standardSeating;
    public int vipSeating;
    public String showTime;
    public double priceStandard;
    public double priceVIP;
    public int screen;
    public int day;

    //Constructor for objects of class Screen  
    public Screen (String ft, int ss, int vs , String filmT, double pr, double prv, int sc, int dy){
        filmTitle = ft;
        standardSeating = ss;
        vipSeating = vs;
        showTime = filmT;
        priceStandard = pr;
        priceVIP = prv;
        screen = sc;
        day = dy;
    }
    
    // getter methods for class variables.
    public String getFilmTitle()
    {
        return this.filmTitle;
    }
    
    public int getStandardSeating()
    {
        return this.standardSeating;
    }
    
    public int getVipSeating()
    {
        return this.vipSeating;
    }
    
    public String getShowTime()
    {
        return this.showTime;
    }
    
    public double getPriceStandard()
    {
        return this.priceStandard;
    }
    
    public double getPriceVIP()
    {
        return this.priceVIP;
    }
    
    public int getScreen()
    {
        return this.screen;
    }
    
    public int getDay()
    {
        return this.day;
    }
    
    // setter methods for class variables.
    public void setFilmTitle(String value)
    {
         this.filmTitle = value;
    }
    
    public void setStandardSeating(int value)
    {
         this.standardSeating = value;
    }
    
    public void setVipSeating(int value)
    {
         this.vipSeating = value;
    }
    
    public void setShowTime(String value)
    {
         this.showTime = value;
    }
    
    public void setPriceStandard(double value)
    {
         this.priceStandard = value;
    }
    
    public void setPriceVIP(double value)
    {
         this.priceVIP = value;
    }
    
    public void setScreen(int value)
    {
         this.screen = value;
    }
    
    public void setDay(int value)
    {
         this.day = value;
    }
    
    // toString() Method.
    public String toString() {
        return "Film = " + filmTitle + "\nStandard Seating = " + standardSeating + "\nVIP Seating = " + 
            vipSeating + "\nShow Time = " + showTime + "\nStandard Price = " + priceStandard + 
            "\nVIP Price = " + priceVIP +"\nScreen = " + screen + "\nDay = " + day;
    }
}
