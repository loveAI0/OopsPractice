import java.time.LocalDateTime;
public class Main{
    public static void main(String[] args){
        Inventory store = new Inventory();
// cause of Inheritance
//        Item item1 = new Item("Apple", 400);
//        Item item2 = new Item("AK47", 56);


//        store.getItem(item1);
//        store.getItem(item2);

        // cause of Overloading
//        Weapon weapon1 = new Weapon("AK47", 45, 900, "Automatic", "Russia", 150);
//        Weapon weapon2 = new Weapon("MK12", 50, 980, "ShortGun", "America", 10);


        Fruit fruit1 = new Fruit("Apple", 800, "Kashmiri", "2026-09-12", "2026-11-20");


        store.getItem("AK47", 45, 900, "Automatic", "Russia", 150);
        store.getItem("MK12", 50, 980, "ShortGun", "America", 10);
        store.getItem(fruit1);

        store.displayInventory();

        System.out.println("------------specific type ------------");

        store.displayInventory("Kashmiri");

        System.out.println(LocalDateTime.now());
    }
}