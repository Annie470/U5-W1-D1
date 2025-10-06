package annie470.U5_W1_D1.entities;

import com.sun.net.httpserver.HttpPrincipal;

public class HawaiianPizza extends Margherita{
    private Topping ham;
    private Topping pineapple;

    public HawaiianPizza(Topping cheese, String tomato, Topping ham, Topping pineapple, int calories, double price) {
        super(cheese, tomato, calories, price);
        this.ham=ham;
        this.pineapple=ham;
    }
}
