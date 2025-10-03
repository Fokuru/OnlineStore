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

import java.util.ArrayList;


public class Store
{
  double profit;
  ArrayList<ItemForSale> items;
  public Store() {
    profit = 0.0;
    items = new ArrayList<ItemForSale>();
  }

  public String showItems() {
    if (items.size() == 0) {
      return "No items available";
    }
    String placeHolder = "";
    for (int i = 0; i < items.size(); i++) {
      if (i == items.size() - 1) {
        placeHolder = placeHolder + items.get(i).returnName();
        break;
      }
      placeHolder = placeHolder + items.get(i).returnName() + ", ";
    }
    return placeHolder;
  }

  public void addItem(ItemForSale toAdd) {
    items.add(toAdd);
  }

  public Boolean sellItem(ItemForSale itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).returnName().equals(itemName.returnName()) && items.get(i).returnPrice() == itemName.returnPrice() 
          && items.get(i).authorName().equals(itemName.authorName()) && items.get(i).returnGenres().equals(itemName.returnGenres())) {
        profit = profit + items.get(i).returnPrice();
        items.remove(i);
        return true;
      }
    }
    return false;
  }

  public String creator(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).returnName().equals(itemName)) {
        return items.get(i).authorName();
      }
    }
    return null;
  }
}
