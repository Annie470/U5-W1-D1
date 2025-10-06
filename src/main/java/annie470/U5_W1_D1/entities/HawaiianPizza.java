package annie470.U5_W1_D1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter

public class HawaiianPizza extends Margherita{
    private List<Topping> topping;

    public HawaiianPizza(List<Topping> topping, String tomato, int calories, double price) {
        super(cheese, tomato, calories, price);
        this.topping = topping;}

    @Override
    public String toString() {
        return "HawaiianPizza{" +
                "topping=" + topping +
                ", tomato='" + tomato + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", cheese=" + cheese +
                ", tomato='" + tomato + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
