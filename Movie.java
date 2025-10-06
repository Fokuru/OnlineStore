// By: Raley Wilkin
// Date: 9/12/2023
// Description: A class that represents a movie, which is a type of item for sale.
public class Movie extends ItemForSale
{
    // Additional variable specific to Movie
    private int duration; //in minutes
    
    // Constructor for Movie
    // Precondition: String: name, double: price, String: author, and int: duration are provided
    // Postcondition: A Movie object is created with the specified attributes
    public Movie(String name, double price, String author, int duration)
    {
        super(name, price, author);
        this.duration = duration;
    }

    // Default constructor for Movie
    // Precondition: None
    // Postcondition: A Movie object is created with default attributes
    public Movie() {
        super("Default Movie", 14.99, "Default Director");
        this.duration = 120;
    }
    
    // Method to return the duration of the movie
    // Precondition: None
    // Postcondition: The duration of the movie is returned
    public int returnDuration() {
        return duration;
    }
}
