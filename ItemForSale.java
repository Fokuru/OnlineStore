import java.util.ArrayList;

public class ItemForSale
{
    private double price;
    private String name;
    private String author;
    private ArrayList<String> genres;

    public ItemForSale(String name, double price, String author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        genres = new ArrayList<String>();
    }

    public String returnName() {
        return name;
    }

    public double returnPrice() {
        return price;
    }

    public String authorName() {
        return author;
    }

    public void addGenre(String genre) {
        genres.add(genre);
    }

    public String returnGenres() {
        if (genres.size() == 0) {
            return name + " has no recorded genres";
        }
        String genreList = genres.get(0);
        for (int i = 1; i < genres.size(); i++) {
            genreList = genreList + ", " +genres.get(i);
        }
        return "The genres for " + name + " are: " +  genreList;
    }
}