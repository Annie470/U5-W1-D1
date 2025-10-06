package annie470.U5_W1_D1.entities;

public class SalamiPizza  extends Margherita{
    private Topping salami;

    public SalamiPizza(Topping cheese, String tomato,Topping salami , int calories, double price ) {
        super(cheese, tomato, calories, price);
        this.salami = salami;
    }
}
