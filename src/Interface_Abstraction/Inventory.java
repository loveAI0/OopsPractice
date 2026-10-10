package Interface_Abstraction;

import java.util.ArrayList;
public class Inventory {
    private ArrayList<Item> items_store;

    public Inventory() {

        items_store = new ArrayList<Item>();
    }

    public void getItem(Item item) {
        items_store.add(item);
    }

    public void getItem(String name, int quantity, String type, String pkgdate, String expdate) {
        items_store.add(new Fruit(name, quantity, type, pkgdate, expdate));
    }

    // that's overloading
    public void displayInventory() {
        for (Item stored_item : items_store) {
            System.out.println(stored_item.printInfo());
        }
    }

    public void displayInventory(String type) {
        for (Item stored_item : items_store) {
            if (stored_item.getType() == type) {
                System.out.println(stored_item.printInfo());
            }
        }
    }

}