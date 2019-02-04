
/**
 * Class Rating
 *
 * @Aisling Mcgettigan
 * 
 */
public class Rating
{
    //instance variables declared
    private String filmName;
    private int numericalRating;

    //Constructor for objects of class Rating
    public Rating(String fn, int nr)
    {
        filmName = fn;
        numericalRating = nr;
    }

   //getter methods for class Rating
    public String getFilmName()
    {
        return this.filmName;
    }
   
    
    public int getNumericalRating()
    {
        return this.numericalRating;
    }
    
    
    //setter methods for class Rating
    public void setFilmName(String value)
    {
         this.filmName = value;
    }
    
    public void setNumericalRating(int value)
    {
         this.numericalRating = value;
    }
    
    
    //toString Method
    public String toString() 
    {
        return "Film Name = " + filmName + "\nRating = " + numericalRating;
    }
}


