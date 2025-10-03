
public class Book extends ItemForSale
{
    private int pageCount;
    
    public Book(String name, double price, String author, int pageCount)
    {
        super(name, price, author);
        this.pageCount = pageCount;
    }

    public Book() {
        super("Default Book", 9.99, "Default Author");
        this.pageCount = 100;
    }
    
    public int returnPageCount() {
        return pageCount;
    }
}