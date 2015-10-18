package entity;

public abstract class Sweets {

    private double price;
    private double weight;
    private int sugar;

    public Sweets(double price , double weight , int sugar ){
        if(price<=0) {
            throw new RuntimeException("Цена не может быть меньше или равен нулю");
        }
        this.price = price;
        if(weight<=0) {
            throw new RuntimeException("Weight не может быть меньше или равен нулю");
        }
        this.weight =weight;
       if(sugar<=0) {
           throw new RuntimeException("Sugar не может быть меньше или равен нулю");
       }
       this.sugar = sugar;
    }

    public double getPrice(){return price;}
    public void setPrice(double price){this.price = price;}
    public double getWeight(){return weight;}
    public void setWeight(double weight){this.weight = weight; }
    public int getSugar(){return sugar;}
    public void setSugar(int sugar){this.sugar = sugar; }
}
