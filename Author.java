// By: Raley Wilkin
// Date: 9/12/2023
// Description: A class that represents an author of items for sale.

public class Author
{
    // Variable for Author
    private String name;

    // Constructor for Author
    // Precondition: A string representing the name of the author is provided
    // Postcondition: An Author object is created with the specified name
    public Author(String name)
    {
        this.name = name;
    }

    // Method to return the name of the author
    // Precondition: None
    // Postcondition: The name of the author is returned
    public String returnName() {
        return name;
    }
}
