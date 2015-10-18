package entity;

public class Snikers extends  Sweets {
   public static final String name = "Snikers";
    public Snikers(double price, double weight, int sugar) {
        super(price, weight, sugar);
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString(){
        return getName() + " (Price = " + getPrice() + ", Weight = "
                + getWeight() + ", Sugar = " + getSugar() + ")";
    }
}
