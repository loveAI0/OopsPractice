import java.time.LocalDate;
public class Fruit extends Item{
    private String pkgdate;
    private String expdate;


    public Fruit(String name, int quantity,String type, String pkgdate, String expdate){
        super(name, quantity, type);
        this.pkgdate = pkgdate;
        this.expdate = expdate;
    }
//    @Override
//    public String toString(){
//        return super.toString() + " | " + LocalDate.parse (pkgdate) + " | " + LocalDate.parse (expdate);
//    }

    @Override
    public String printInfo(){
        return getName() + " | " + getQuantity() + " | " + getType() + " | " + LocalDate.parse (pkgdate) + " | " + LocalDate.parse (expdate);
    }
}