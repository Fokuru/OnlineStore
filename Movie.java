public class Movie extends ItemForSale
{
    private int duration; //in minutes
    
    public Movie(String name, double price, String author, int duration)
    {
        super(name, price, author);
        this.duration = duration;
    }

    public Movie() {
        super("Default Movie", 14.99, "Default Director");
        this.duration = 120;
    }
    
    public int returnDuration() {
        return duration;
    }
}
