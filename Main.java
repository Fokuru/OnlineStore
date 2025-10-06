// By: Raley Wilkin
// Date: 9/12/2023
// Description: The main class to test the functionality of the online store system.

public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
         // Starting code. Made store and a book. Added book to store and printed whether or not it counts as an item for sale. Tried printing out the items in the store.
         Store s = new Store();
         Book b = new Book("Endling: The Last", 12.99, "Kirsten White", 320);
         System.out.println(b instanceof ItemForSale);
         s.addItem(b);
         System.out.println(s.showItems());

         // Added a movie to the store and printed out the items in the store.
         Movie m = new Movie("Inception", 14.99, "Christopher Nolan", 148);
         s.addItem(m);
         System.out.println(s.showItems());

         // Tested out the genre methods in ItemForSale.java
         // Added genres to both the book and movie and printed out the genres for each item.
         System.out.println(b.returnGenres());
         b.addGenre("Fantasy");
         b.addGenre("Adventure");
         System.out.println(b.returnGenres());
         m.addGenre("Sci-Fi");
         m.addGenre("Thriller");
         System.out.println(m.returnGenres());

         // Tried out the return methods in ItemForSale.java
         System.out.println(m.returnName());
         System.out.println(m.returnPrice());
         System.out.println(b.returnName());
         System.out.println(b.returnPrice());

         // Tried out the creator methods in Store.java
         System.out.println(s.creator("Inception"));
         System.out.println(s.creator("Endling: The Last"));

         // Tried out the sellItem method in Store.java
         // Printed out the items in the store after each sellItem call to see if it worked
         System.out.println(s.sellItem(m));
         System.out.println(s.showItems());

         System.out.println(s.sellItem(b));
         System.out.println(s.showItems());

         // Tried to sell an item that is no longer in the store
         System.out.println(s.sellItem(b));
         System.out.println(s.showItems());

         // Printed out the profit of the store after selling the two items
         System.out.println(s.profit);
     }
}
