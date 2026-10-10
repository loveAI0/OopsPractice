package Interface_Abstraction;

import java.time.LocalDate;

//public class Fruit extends Item, implements ItemStuff

public class Fruit extends Item{
    private String pkgdate;
    private String expdate;

    public Fruit(String name, int quantity,String type, String pkgdate, String expdate){
        super(name, quantity, type);
        this.pkgdate = pkgdate;
        this.expdate = expdate;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ " | " + LocalDate.parse (pkgdate) + " | " + LocalDate.parse (expdate);
    }
}
