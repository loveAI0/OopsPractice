
import java.util.ArrayList;
public class Inventory{
    private ArrayList<Item> items_store;

    public Inventory(){

        items_store = new ArrayList<Item>();
    }

    public void getItem(Item item){
        items_store.add(item);
    }

    //overloading compile time
    public void getItem(String name, int quantity, int damage, String type, String origin, int cartage){
        items_store.add(new Weapon(name, quantity, damage, type, origin, cartage));
    }

 // that's overloading
    public void displayInventory(){
        for(Item stored_item : items_store){
            System.out.println(stored_item.printInfo());
        }
    }

    public void displayInventory(String type){
        for(Item stored_item : items_store){
            if(stored_item.getType() == type){
                System.out.println(stored_item.printInfo());
            }
        }
    }

//    public void displayInventory(){
//        for(Item item : items_store){
//            System.out.println(item.getName() + " | " + item.getQuantity());
//        }
//    }
}
