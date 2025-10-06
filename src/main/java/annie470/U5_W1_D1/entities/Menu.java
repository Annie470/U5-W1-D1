package annie470.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Menu {
    private List<Drink> drinks;
    private List<Topping> toppings;
    private List<Margherita> pizzas;
}
