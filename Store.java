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

// By: Raley Wilkin 
// Date: 9/12/2023
// Description: A class that represents a store which sells items.

// Importing necessary libraries
import java.util.ArrayList;

public class Store
{
  // Variables for Store
  double profit;
  ArrayList<ItemForSale> items;

  // Constructor for Store
  // Precondition: None
  // Postcondition: A Store object is created with default attributes
  public Store() {
    profit = 0.0;
    items = new ArrayList<ItemForSale>();
  }

  // Show items in the store
  // Precondition: None
  // Postcondition: A string listing all items in the store is returned
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

  // Add an item to the store
  // Precondition: An ItemForSale object is provided
  // Postcondition: The item is added to the store's list of items
  public void addItem(ItemForSale toAdd) {
    items.add(toAdd);
  }

  // Sell an item from the store
  // Precondition: An ItemForSale object is provided
  // Postcondition: The item is removed from the store's list of items and its price is added to profit if the item exists in the store
  //                 Returns true if the item was sold, false otherwise.
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

  // Get the creator of an item in the store
  // Precondition: A string representing the name of the item is provided
  // Postcondition: The name of the creator of the item is returned if the item exists in the store, null otherwise
  public String creator(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).returnName().equals(itemName)) {
        return items.get(i).authorName();
      }
    }
    return null;
  }
}
