public class Weapon extends Item{
    private int damage;
    private String origin;
    private int cartage;

    public Weapon(String name, int quantity, int damage, String type, String origin, int cartage){
        super(name, quantity, type);
        this.damage = damage;
        this.origin = origin;
        this.cartage = cartage;
    }

//    @Override
//    public String toString() {
//        return super.toString() + " | " + damage + " | " + origin + " | " + cartage;
//    }

    @Override
    public String printInfo(){
        return getName() + " | " + getQuantity() + " | " + getType() + " | " + damage + " | " + origin + " | " + cartage;
    }
}