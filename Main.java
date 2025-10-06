
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book("Endling: The Last", 12.99, "Kirsten White", 320);
        System.out.println(b instanceof ItemForSale);

         s.addItem(b);
         System.out.println(s.showItems());

         Movie m = new Movie("Inception", 14.99, "Christopher Nolan", 148);
         s.addItem(m);
         System.out.println(s.showItems());

         System.out.println(b.returnGenres());
         b.addGenre("Fantasy");
         b.addGenre("Adventure");
         System.out.println(b.returnGenres());
         m.addGenre("Sci-Fi");
         m.addGenre("Thriller");
         System.out.println(m.returnGenres());

         System.out.println(b.returnPrice());

         System.out.println(s.creator("Inception"));
         System.out.println(s.creator("Endling: The Last"));

         System.out.println(s.sellItem(m));
         System.out.println(s.showItems());

         System.out.println(s.sellItem(b));
         System.out.println(s.showItems());

         System.out.println(s.sellItem(b));
         System.out.println(s.showItems());
         
         System.out.println(s.profit);
     }
}
