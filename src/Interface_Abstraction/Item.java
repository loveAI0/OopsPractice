package Interface_Abstraction;

import java.time.LocalDate;

public class Item implements ItemStuff{
    private String name;
    private int quantity;
    private String type;

    public Item(String name, int quantity,String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;

    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getQuantity(){
        return quantity;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public String printInfo() {
        return name + " | " + quantity + " | " + type;
    }
}
