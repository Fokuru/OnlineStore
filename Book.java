// By: Raley Wilkin
// Date: 9/12/2023
// Description: A class that represents a book, which is a type of item for sale.
public class Book extends ItemForSale
{
    // Additional variable specific to Book
    private int pageCount;
    
    // Constructor for Book
    // Precondition: String: name, double: price, String: author, and int: pageCount are provided
    // Postcondition: A Book object is created with the specified attributes
    public Book(String name, double price, String author, int pageCount)
    {
        super(name, price, author);
        this.pageCount = pageCount;
    }

    // Default constructor for Book
    // Precondition: None
    // Postcondition: A Book object is created with default attributes
    public Book() {
        super("Default Book", 9.99, "Default Author");
        this.pageCount = 100;
    }
    
    // Method to return the page count of the book
    // Precondition: None
    // Postcondition: The page count of the book is returned
    public int returnPageCount() {
        return pageCount;
    }
}