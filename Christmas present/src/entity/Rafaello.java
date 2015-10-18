package entity;


public class Rafaello extends Sweets {
    public static final String name = "Rafaello";
    public Rafaello(double price, double weight, int sugar) {
        super(price, weight, sugar);
    }

    /**
     *
     * @return getName
     */
    public static String getName() {
        return name;
    }

    @Override
    public String toString(){
        return getName() + " (Price = " + getPrice() + ", Weight = "
                + getWeight() + ", Sugar = " + getSugar() + ")";
    }
}
