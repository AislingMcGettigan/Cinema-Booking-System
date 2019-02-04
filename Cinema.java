
/** Main class
 * Aisling Mcgettigan
 **/

import java.util.*;
import java.util.Scanner;

class Cinema {
    
    public static void main(String[] args) {
        
        //declare scanner class
        Scanner sc = new Scanner(System.in);
        //screen loop variable
        //initialising variables
        int screenLoopCount = 1;
        int filmViewCount = 0;
        double ratingValueHolder = 0.00;
        int totalRatingsHolder = 0;
        double averageRating = 0.00;
        double totalCostPerFilm = 0.00;
        double ticketTypePrice = 0.00;
        
        //Array List for Customer, Screen, Rating and Film Name
        ArrayList<Screen> filmArray = new ArrayList<Screen>();
        ArrayList<Customer> customerArray = new ArrayList<Customer>();
        ArrayList<Rating> ratingArray = new ArrayList<Rating>();
        ArrayList<String> filmNameArray = new ArrayList(6);
        
        filmNameArray.add("Taken 1");
        filmNameArray.add("Star Wars 1");
        filmNameArray.add("The Avengers");
        filmNameArray.add("Dirty Dancing");
        filmNameArray.add("The Notebook");
        filmNameArray.add("Saw 3");
        
        //For loop for every day of 31 day month
        for(int d = 1; d <= 31; d++){
            //enhanced for loop looping over film array
            for (String film : filmNameArray){
                Screen temp1 = new Screen(film, 40, 10, "1:00pm", 4.00, 6.00, screenLoopCount, d);
                Screen temp2 = new Screen(film, 40, 10, "5:00pm", 8.00, 10.00, screenLoopCount, d);
                Screen temp3 = new Screen(film, 40, 10, "8:00pm", 12.00, 14.00, screenLoopCount, d);
                Screen temp4 = new Screen(film, 40, 10, "11:00pm", 10.00, 12.00, screenLoopCount, d);
                    
                filmArray.add(temp1);
                filmArray.add(temp2);
                filmArray.add(temp3);
                filmArray.add(temp4); 
                    
                screenLoopCount = screenLoopCount + 1;
            }
                
            screenLoopCount = 1;
        }
        
        // Dummy Data added..15 Customers, 10 Standard, 5 VIP, 6 Films
        Customer dummyCustomer1 = new Customer("Aisling McGettigan", "Cash", "Star Wars 1", "8:00PM", "VIP", 2,
            10, 1, 222, 14.00);
        Customer dummyCustomer2 = new Customer("Cathal Diver", "Cash", "Star Wars 1", "8:00PM", "VIP", 2,
            10, 1, 222, 14.00);
        Customer dummyCustomer3 = new Customer("Erin McIvor", "Credit Card", "Star Wars 1", "8:00PM", "Standard", 2,
            10, 1, 222, 14.00);
        Customer dummyCustomer4 = new Customer("Mark McIvor", "Credit Card", "Star Wars 1", "8:00PM", "Standard", 2,
            10, 1, 222, 14.00);
        Customer dummyCustomer5 = new Customer("David McGettigan", "Credit Card", "Taken 1", "5:00PM", "VIP", 1,
            27, 1, 625, 10.00);
        Customer dummyCustomer6 = new Customer("Dee McGettigan", "Cash", "Taken 1", "5:00PM", "VIP", 1,
            27, 1, 625, 10.00);
        Customer dummyCustomer7 = new Customer("Paul McGettigan", "Credit Card", "The Notebook", "5:00PM", "Standard", 5,
            18, 1, 425, 8.00);
        Customer dummyCustomer8 = new Customer("Meghan McGettigan", "Cash", "The Notebook", "5:00PM", "VIP", 5,
            18, 1, 425, 10.00);
        Customer dummyCustomer9 = new Customer("Katie McGettigan", "Cash", "The Avengers", "8:00PM", "Standard", 3,
            2, 1, 34, 12.00);
        Customer dummyCustomer10 = new Customer("Emma McGettigan", "Cash", "The Avengers", "8:00PM", "Standard", 3,
            2, 1, 34, 12.00);
        Customer dummyCustomer11 = new Customer("Liam McGettigan", "Cash", "Dirty Dancing", "8:00PM", "Standard", 4,
            7, 1, 158, 12.00);
        Customer dummyCustomer12 = new Customer("Kevin McGettigan", "Cash", "Dirty Dancing", "8:00PM", "Standard", 4,
            7, 1, 158, 12.00);
        Customer dummyCustomer13 = new Customer("Eamonn McGettigan", "Cash", "Dirty Dancing", "8:00PM", "Standard", 4,
            7, 1, 158, 12.00);
        Customer dummyCustomer14 = new Customer("Enda McGettigan", "Credit Card", "Saw 3", "5:00PM", "Standard", 6,
            13, 1, 309, 8.00);
        Customer dummyCustomer15 = new Customer("Bobby McGettigan", "Credit Card", "Saw 3", "5:00PM", "Standard", 6,
            13, 1, 309, 8.00);            
            
        customerArray.add(dummyCustomer1);
        customerArray.add(dummyCustomer2);
        customerArray.add(dummyCustomer3);
        customerArray.add(dummyCustomer4);
        customerArray.add(dummyCustomer5);
        customerArray.add(dummyCustomer6);
        customerArray.add(dummyCustomer7);
        customerArray.add(dummyCustomer8);
        customerArray.add(dummyCustomer9);
        customerArray.add(dummyCustomer10);
        customerArray.add(dummyCustomer11);
        customerArray.add(dummyCustomer12);
        customerArray.add(dummyCustomer13);
        customerArray.add(dummyCustomer14);
        customerArray.add(dummyCustomer15);
        
        // Setting seating to reflect dummy data
        filmArray.get(222).setStandardSeating(38);
        filmArray.get(425).setStandardSeating(39);
        filmArray.get(34).setStandardSeating(38);
        filmArray.get(158).setStandardSeating(37);
        filmArray.get(309).setStandardSeating(38);
        filmArray.get(222).setVipSeating(8);
        filmArray.get(625).setVipSeating(8);
        filmArray.get(425).setVipSeating(9);
        
        // Numerical Ratings added for 10Customers
        Rating dummyRating1 = new Rating("Star Wars 1", 5);
        Rating dummyRating2 = new Rating("Star Wars 1", 4);
        Rating dummyRating3 = new Rating("Star Wars 1", 5);
        Rating dummyRating4 = new Rating("Dirty Dancing", 4);
        Rating dummyRating5 = new Rating("Taken 1", 5);
        Rating dummyRating6 = new Rating("Saw 3", 1);
        Rating dummyRating7 = new Rating("The Notebook", 4);
        Rating dummyRating8 = new Rating("Taken 1", 2);
        Rating dummyRating9 = new Rating("The Avengers", 2);
        Rating dummyRating10 = new Rating("Dirty Dancing", 3);
                
        ratingArray.add(dummyRating1);
        ratingArray.add(dummyRating2);
        ratingArray.add(dummyRating3);
        ratingArray.add(dummyRating4);
        ratingArray.add(dummyRating5);
        ratingArray.add(dummyRating6);
        ratingArray.add(dummyRating7);
        ratingArray.add(dummyRating8);
        ratingArray.add(dummyRating9);
        ratingArray.add(dummyRating10);
        
        //Added in order to exit menu
        boolean exit = false;
        
        //initialise variables selectedFilmName,changeSelectedFilmName, selectedTicketType and paymentMethod
        String selectedFilmName = "";
        String changeSelectedFilmName = "";
        String paymentMethod = "";
        String selectedTicketType = "";
        
        
        //Do while statement
        
        do{
        
            System.out.println("Menu:");
            System.out.println("1   - View Films List");
            System.out.println("2   - View Films Times");
            System.out.println("3   - Book a ticket");
            System.out.println("4   - View Customer Array");
            System.out.println("5   - Change Date/Time of Booking");
            System.out.println("6   - Add a New Film Rating");
            System.out.println("7   - View Ratings Array");
            System.out.println("8   - Report 1");
            System.out.println("9   - Report 2");
            System.out.println("10  - Exit \n");
            
            System.out.println("Please select an option!");
            
            String input = sc.nextLine();
            
            System.out.println("______________________________________\n");
            
            // Switch Statement
            switch (input) {
            case "1":
                for (String a : filmNameArray) {
                    System.out.println(a);
                    System.out.println("");
                }
                
                System.out.println("______________________________________\n");
                
                 break;
    
            case "2":       
                for (Screen screen : filmArray) {
                    System.out.println(screen.getFilmTitle() + " - " + screen.getShowTime() 
                        + " - Screen: " + screen.getScreen());
                    System.out.println("");
                }
                
                System.out.println("______________________________________\n");
                
                break;
             
                //Print out dates for booking
            case "3":       
                System.out.println("Month");
                System.out.println("M   T   W   T   F   S   S");
                System.out.println("1   2   3   4   5   6   7");
                System.out.println("8   9   10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                System.out.println("29  30  31");
                
                System.out.println("\nPlease select an Date from above!\n");
                
                String dateSelected = sc.nextLine();  
                
                System.out.println("\n______________________________________\n");
                
            //As arrayLists start from 0, I added i+1 so that my film options would not start with option number 0.
                for(int i = 0; i < filmNameArray.size(); i++){
                    System.out.println((i + 1) + ". - " + filmNameArray.get(i) + "\n");
                }
                
                System.out.println("\nPlease select an film from above!\n");
                
                String filmSelection = sc.nextLine();  
                
                System.out.println("\n______________________________________\n");
                
                //getting filmName from filmArray using user input
                selectedFilmName = filmNameArray.get(Integer.parseInt(filmSelection) - 1);
                
                System.out.println("\nFILM SCREENING OPTIONS\n");
                //For Loop
                for (int i = 0; i < filmArray.size(); i++) {
                    if (filmArray.get(i).getFilmTitle().contains(selectedFilmName)) {
                        if(filmArray.get(i).getDay() == Integer.parseInt(dateSelected)) {
                            System.out.println("\n" + i);
                            System.out.println("Time: " + filmArray.get(i).getShowTime());
                            System.out.println("Standard Seats Available: " + filmArray.get(i).getStandardSeating());
                            System.out.println("VIP Seats Available: " + filmArray.get(i).getVipSeating());
                            System.out.println("Standard Ticket Price(GBP): " + filmArray.get(i).getPriceStandard());
                            System.out.println("VIP Ticket Price(GBP): " + filmArray.get(i).getPriceVIP() + "\n");
                        }
                    }
                }
                
                System.out.println("From option above please input the number of the show time you would like to see: \n");
                
                String timeSelection = sc.nextLine();
                
                System.out.println("\nYou selected the " + 
                    filmArray.get(Integer.parseInt(timeSelection)).getShowTime() + " showing\n");
                
                System.out.println("______________________________________\n");
                
                System.out.println("Please enter your name:");
                
                String inputCustName = sc.nextLine();
                
                System.out.println("______________________________________\n");
                
                System.out.println("\nPlease select a payment method from below: \n");                
                System.out.println("1.  Cash");
                System.out.println("2.  Credit Card\n");
                
                String inputPaymentMethod = sc.nextLine();
                
                System.out.println("______________________________________\n");
                 //convert to int               
                if(Integer.parseInt(inputPaymentMethod) == 1) {
                    paymentMethod = "Cash";
                } else if(Integer.parseInt(inputPaymentMethod) == 2) {
                    paymentMethod = "Credit Card";
                }
                
                System.out.println("______________________________________\n");
                
                System.out.println("\nPlease select the ticket type from below: \n");                
                System.out.println("1.  Standard");
                System.out.println("2.  VIP\n");
                
                String inputTicketType = sc.nextLine();
                
                System.out.println("______________________________________\n");
                 //convert to int               
                if(Integer.parseInt(inputTicketType) == 1) {
                    selectedTicketType = "Standard";
                } else if(Integer.parseInt(inputTicketType) == 2) {
                    selectedTicketType = "VIP";
                }
                
                System.out.println("Remaining seats for this showing: ");
                System.out.println("Standard: " + filmArray.get(Integer.parseInt(timeSelection)).getStandardSeating());
                System.out.println("VIP: " + filmArray.get(Integer.parseInt(timeSelection)).getVipSeating() + "\n");
                System.out.println("\nPlease enter the number of tickets you require: \n");                
                
                String inputTicketAmount = sc.nextLine();
                
                System.out.println("______________________________________\n");
                
                if(selectedTicketType == "Standard"){
                    ticketTypePrice = filmArray.get(Integer.parseInt(timeSelection)).getPriceStandard();
                } else {
                    ticketTypePrice = filmArray.get(Integer.parseInt(timeSelection)).getPriceVIP();
                }
                
                // Creating New Customer
                Customer tempCustomer = new Customer(inputCustName, 
                    paymentMethod, 
                    filmArray.get(Integer.parseInt(timeSelection)).getFilmTitle(), 
                    filmArray.get(Integer.parseInt(timeSelection)).getShowTime(),
                    selectedTicketType,
                    filmArray.get(Integer.parseInt(timeSelection)).getScreen(),
                    Integer.parseInt(dateSelected), 
                    Integer.parseInt(inputTicketAmount),
                    Integer.parseInt(timeSelection), 
                    ticketTypePrice);
                
                customerArray.add(tempCustomer);
                
                // Deducting seats purchased from available seats in film array.
                if(Integer.parseInt(inputTicketType) == 1) {
                    filmArray.get(Integer.parseInt(timeSelection)).setStandardSeating(
                        filmArray.get(Integer.parseInt(timeSelection)).getStandardSeating() - Integer.parseInt(inputTicketAmount));
                } else if(Integer.parseInt(inputTicketType) == 2) {
                    filmArray.get(Integer.parseInt(timeSelection)).setVipSeating(
                        filmArray.get(Integer.parseInt(timeSelection)).getVipSeating() - Integer.parseInt(inputTicketAmount));
                }
                            
                System.out.println("\nThanks " + inputCustName + ", you choose to pay by " + paymentMethod + "\n");
                System.out.println("\nYou purchased: \n" + customerArray.get(customerArray.size() - 1).toString() + "\n");
                
                System.out.println("______________________________________\n");
                
                break;
               
            case "4":
                // Exception handling for empty customer array and print out all customers if any found
                if(customerArray.size() == 0) {
                    System.out.println("\nCustomer array is empty!\n");
                } else {
                    System.out.println("\nCURRENT CUSTOMERS\n");
                    for (int i = 0; i < customerArray.size(); i++) {
                        System.out.println("\nOrder #" + (i + 1) + ":\n" + customerArray.get(i).toString() + "\n");
                    }
                }
                
                System.out.println("______________________________________\n");
                break;
                
            case "5":
                // Changing ticket date/time/film
                System.out.println("Please enter your order number: ");
                
                String inputTicketNum = sc.nextLine();
                
                System.out.println("\nOrder Found! \n" + customerArray.get(Integer.parseInt(inputTicketNum) - 1).toString() + "\n");
                
                
                System.out.println("______________________________________\n");
                
                System.out.println("Month");
                System.out.println("M   T   W   T   F   S   S");
                System.out.println("1   2   3   4   5   6   7");
                System.out.println("8   9   10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                System.out.println("29  30  31");
                
                System.out.println("\nPlease select a new Date from above!\n");
                
                String changeDateSelected = sc.nextLine();  
                
                System.out.println("\n______________________________________\n");
            
                for(int i = 0; i < filmNameArray.size(); i++){
                    System.out.println((i + 1) + ". - " + filmNameArray.get(i) + "\n");
                }
                
                System.out.println("\nPlease select a new film from above!\n");
                
                String changeFilmSelection = sc.nextLine();  
                
                System.out.println("\n______________________________________\n");
                
                //getting filmName from filmArray using user input
                changeSelectedFilmName = filmNameArray.get(Integer.parseInt(changeFilmSelection) - 1);
                
                System.out.println("\nFILM SCREENING OPTIONS\n");
                //For Loop
                for (int i = 0; i < filmArray.size(); i++) {
                    if (filmArray.get(i).getFilmTitle().contains(changeSelectedFilmName)) {
                        if(filmArray.get(i).getDay() == Integer.parseInt(changeDateSelected)) {
                            System.out.println("\n" + i);
                            System.out.println("Time: " + filmArray.get(i).getShowTime());
                            System.out.println("Standard Seats Available: " + filmArray.get(i).getStandardSeating());
                            System.out.println("VIP Seats Available: " + filmArray.get(i).getVipSeating());
                            System.out.println("Standard Ticket Price(GBP): " + filmArray.get(i).getPriceStandard());
                            System.out.println("VIP Ticket Price(GBP): " + filmArray.get(i).getPriceVIP() + "\n");
                        }
                    }
                }
                
                System.out.println("From option above please input the number of the new show time you would like to see: \n");
                
                String changeTimeSelection = sc.nextLine();
                
                System.out.println("\nYour new booking is for the " + 
                    filmArray.get(Integer.parseInt(changeTimeSelection)).getShowTime() + " showing on the " 
                        + filmArray.get(Integer.parseInt(changeTimeSelection)).getDay() + " \n");
                
                System.out.println("______________________________________\n");
                
                customerArray.get(Integer.parseInt(inputTicketNum) - 1).setDay(Integer.parseInt(changeDateSelected));
                
                customerArray.get(Integer.parseInt(inputTicketNum) - 1).setFilmName(filmNameArray.get(Integer.parseInt(changeFilmSelection) - 1));
                
                customerArray.get(Integer.parseInt(inputTicketNum) - 1).setShowTime(filmArray.get(Integer.parseInt(changeTimeSelection)).getShowTime());
                
                //Check ticket type and resets to original seat count and deducts seats from new order.
                if(customerArray.get(Integer.parseInt(inputTicketNum) - 1).getTicketType().contains("Standard")) {
                    filmArray.get(customerArray.get(Integer.parseInt(inputTicketNum) - 1).getFilmArrayID()).setStandardSeating(
                        filmArray.get(customerArray.get(Integer.parseInt(inputTicketNum) - 1).getFilmArrayID()).getStandardSeating() + customerArray.get(Integer.parseInt(inputTicketNum) - 1).getNumberOfTickets());
                    filmArray.get(Integer.parseInt(changeTimeSelection)).setStandardSeating(
                        filmArray.get(Integer.parseInt(changeTimeSelection)).getStandardSeating() - customerArray.get(Integer.parseInt(inputTicketNum) - 1).getNumberOfTickets());
                } else if(customerArray.get(Integer.parseInt(inputTicketNum) - 1).getTicketType().contains("VIP")) {
                    filmArray.get(customerArray.get(Integer.parseInt(inputTicketNum) - 1).getFilmArrayID()).setVipSeating(
                        filmArray.get(customerArray.get(Integer.parseInt(inputTicketNum) - 1).getFilmArrayID()).getVipSeating() + customerArray.get(Integer.parseInt(inputTicketNum) - 1).getNumberOfTickets());
                    filmArray.get(Integer.parseInt(changeTimeSelection)).setVipSeating(
                        filmArray.get(Integer.parseInt(changeTimeSelection)).getVipSeating() - customerArray.get(Integer.parseInt(inputTicketNum) - 1).getNumberOfTickets());
                }
                
                System.out.println("Booking Change Complete");
                
                System.out.println("______________________________________\n");
                break;
            //  Rating of Film                 
            case "6":   
                for(int i = 0; i < filmNameArray.size(); i++){
                    System.out.println((i + 1) + ". - " + filmNameArray.get(i) + "\n");
                }
                
                System.out.println("\nPlease select a film number from above to rate!\n");
                
                String filmRatingSelection = sc.nextLine();  
                
                System.out.println("\n______________________________________\n");
                
                System.out.println("\nPlease input a rating from 1 - 5!\n");
                
                String filmRatingValue = sc.nextLine();  
                
                System.out.println("\n______________________________________\n");
                
                Rating tempRating = new Rating(filmNameArray.get((Integer.parseInt(filmRatingSelection) - 1)), 
                    Integer.parseInt(filmRatingValue));
                
                ratingArray.add(tempRating);
                
                break;
            // Exception Handling for empty array.     
            case "7":   
                if(ratingArray.size() == 0) {
                    System.out.println("\nRating array is empty!\n");
                } else {
                    System.out.println("\nCURRENT Ratings\n");
                    for (int i = 0; i < ratingArray.size(); i++) {
                        System.out.println("\nRating #" + (i + 1) + ":\n" + ratingArray.get(i).toString() + "\n");
                    }
                }
                break; 
                
            case "8":   
                //looping over film array- getting average rating
                for (String film : filmNameArray){
                    for (int i = 0; i < customerArray.size(); i++) {
                        if (customerArray.get(i).getFilmName().contains(film)) {
                            filmViewCount = filmViewCount + customerArray.get(i).getNumberOfTickets();  
                        }
                    }
                    for (int i = 0; i < ratingArray.size(); i++) {
                        if (ratingArray.get(i).getFilmName().contains(film)) {    
                            ratingValueHolder = ratingValueHolder + ratingArray.get(i).getNumericalRating(); 
                            totalRatingsHolder = totalRatingsHolder + 1;
                        }
                    }
                    
                    averageRating = ratingValueHolder / totalRatingsHolder;
                    
                    System.out.println("Film Name: " + film + "\n" 
                        + "Number of tickets sold: " + filmViewCount + "\n"
                        + "Average of rating of film: " + averageRating + "\n");
                     
                        // resetting values to 0 for for-loop
                    filmViewCount = 0;
                    ratingValueHolder = 0;
                    totalRatingsHolder = 0;
                    averageRating = 0;
                }        
                
                break; 
                
            case "9":   
                //looping over filmName array- getting total generated income per film
                for (String film : filmNameArray){
                    for (int i = 0; i < customerArray.size(); i++) {
                        if (customerArray.get(i).getFilmName().contains(film)) {
                            ticketTypePrice = ticketTypePrice + (customerArray.get(i).getTicketPrice() * 
                                customerArray.get(i).getNumberOfTickets()); 
                        }
                    }
                    
                    System.out.println("Film Name: " + film + "\n" 
                        + "Income Generated: " + ticketTypePrice + "\n");
                       
                    ticketTypePrice = 0.00;
                }
                
                break; 
                
            case "10":   
                System.out.println("Thanks, come again soon!");
                exit = true;
                break;    
            
            default:
                break;
            }
        }while(exit != true);   
        
        sc.close();
        
    }    
}