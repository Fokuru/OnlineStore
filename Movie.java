public class Movie extends ItemForSale
{
    private int duration; //in minutes
    
    public Movie(String name, double price, String author, int duration)
    {
        super(name, price, author);
        this.duration = duration;
    }
    
    public int returnDuration() {
        return duration;
    }
}
