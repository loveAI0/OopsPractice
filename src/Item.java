//cause of abstraction
/*
public class Item{
    private String name;
    private int quantity;
    private String type;

    public Item(String name, int quantity, String type){
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

//    public String getName(){
//        return name;
//    }
//    public int getQuantity(){
//        return quantity;
//    }
    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return name + " " + quantity + " " + type;
    }

}
*/


public abstract class Item{
    private String name;
    private int quantity;
    private String type;

    public Item(String name, int quantity, String type){
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

        public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getType(){
        return type;
    }

    //this can't have an object only weapon and fruit
//    @Override
//    public String toString(){
//        return name + " " + quantity + " " + type;
//    }

    public abstract String printInfo();

}