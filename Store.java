/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
public class Store
{
  double profit;
  ArrayList items;

  public Store() {
    profit = 0.0;
  }

  public String showItems() {
    String placeHolder = "";
    for (int i = 0; i < items.length(); i++) {
      placeHolder = placeHolder + " " + items[i];
    }
    return placeHolder;
  }

  public void addItem(ItemForSale toAdd) {
    ArrayList.add(toAdd);
  }

  public Boolean sellItem(ItemForSale itemName) {
    for (int i = 0; i < items.length(); i++) {
      if (items[i].returnName().equals(itemName)) {
        profit = profit + items[i].returnPrice();
        items.remove(i);
        return true;
      }
    }
    return false;
  }

  public String creator(itemName) {
    for (int i = 0; i < items.length(); i++) {
      if (items[i].returnName().equals(itemName)) {
        return items[i].authorName();
      }
    }
    return null;
  }
}
