// By: Raley Wilkin
// Date: 9/12/2023
// Description: A class that represents an item for sale in the store.

// Importing necessary libraries
import java.util.ArrayList;

public class ItemForSale
{
    // Variables common to all items for sale
    private double price;
    private String name;
    private String author;
    private ArrayList<String> genres;

    // Constructor for ItemForSale
    // Precondition: String: name, double: price, and String: author are provided
    // Postcondition: An ItemForSale object is created with the specified attributes
    public ItemForSale(String name, double price, String author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        genres = new ArrayList<String>();
    }

    // Return methods for ItemForSale
    // Precondition: None
    // Postcondition: The string for name is returned
    public String returnName() {
        return name;
    }

    // Precondition: None
    // Postcondition: The double for price is returned
    public double returnPrice() {
        return price;
    }

    // Precondition: None
    // Postcondition: The string for author is returned
    public String authorName() {
        return author;
    }

    // Methods to manage genres for the item
    // Precondition: A genre string is provided
    // Postcondition: The genre is added to the list of genres for the item
    public void addGenre(String genre) {
        genres.add(genre);
    }

    // Precondition: None
    // Postcondition: A string listing all genres for the item is returned
    //                 If no genres exist, a message indicating so is returned
    public String returnGenres() {
        // Check if there are no genres
        if (genres.size() == 0) {
            return name + " has no recorded genres";
        }
        // Build a comma-separated list of genres
        String genreList = genres.get(0);
        for (int i = 1; i < genres.size(); i++) {
            genreList = genreList + ", " +genres.get(i);
        }
        // Return the formatted genre list
        return "The genres for " + name + " are: " +  genreList;
    }
}