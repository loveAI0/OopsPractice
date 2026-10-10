package Interface_Abstraction;

public class Main {
    public static void main(String[] args){
        Inventory store = new Inventory();

        store.getItem("Apple", 800, "Kashmiri", "2026-09-12", "2026-11-20");

        store.displayInventory();
    }
}
