
public class Book extends ItemForSale
{
    private int pageCount;
    
    public Book(String name, double price, String author, int pageCount)
    {
        super(name, price, author);
        this.pageCount = pageCount;
    }
    
    public int returnPageCount() {
        return pageCount;
    }
}