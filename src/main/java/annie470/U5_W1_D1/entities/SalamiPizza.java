package annie470.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class SalamiPizza  extends Margherita{
    private Topping salami;

    public SalamiPizza(Topping cheese, String tomato,Topping salami , int calories, double price ) {
        super(cheese, tomato, calories, price);
        this.salami = salami;
    }

    @Override
    public String toString() {
        return "SalamiPizza{" +
                "salami=" + salami +
                ", cheese=" + cheese +
                ", tomato='" + tomato + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
