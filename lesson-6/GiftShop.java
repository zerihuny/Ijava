
// File: lesson-6/GiftShop.java
// This code demonstrates a simple gift shop application that manages items in a store.
// It defines a Storefront class that allows adding items, sorting them, and retrieving their details.
// The main method creates a Storefront instance, adds several items, sorts them, and prints their details.
// The Storefront class uses an ArrayList to store Item objects, which represent individual items in the shop.
// The Item class encapsulates the properties of an item, such as ID, name, retail price, and quantity.
// The code showcases basic object-oriented programming concepts such as encapsulation, data management, and sorting.
public class GiftShop {
  public static void main(String[] arguments) {
        Storefront store = new Storefront();
        store.addItem("C01", "MUG", "9.99", "150");
        store.addItem("C02", "LG MUG", "12.99", "82");
        store.addItem("C03", "MOUSEPAD", "10.49", "800");
        store.addItem("D01", "T SHIRT", "16.99", "90");
       store.sort();

       for (int i = 0; i < store.getSize(); i++) {
            Item show = (Item) store.getItem(i);
            System.out.println("\nItem ID: " + show.getId() +
                "\nName: " + show.getName() +
                "\nRetail Price: $" + show.getRetail() +
                "\nPrice: $" + show.getPrice() +
                "\nQuantity: " + show.getQuantity());
       }
   }
}
