package annie470.U5_W1_D1;

import annie470.U5_W1_D1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean(name = "lemonade")
    public Drink getLemonade(){return new Drink("Lemonade (0.33)", 128, 1.29 );
    }
    @Bean(name = "water")
    public Drink getWater(){return new Drink("Water (0.5l)", 0, 1.29 );
    }
    @Bean(name = "wine")
    public Drink getWine(){return new Drink("Wine (0.75l, 13%)", 607, 7.49 );
    }

    @Bean(name = "cheese")
    public Topping getCheese(){return new Topping("Cheese", 92, 0.69 );
    }
    @Bean(name = "salami")
    public Topping getSalami(){return new Topping("Salami", 86, 0.99 );
    }
    @Bean(name = "ham")
    public Topping getHam(){return new Topping("Ham", 35, 0.99 );
    }
    @Bean(name = "onions")
    public Topping getOnions(){return new Topping("Onions", 22, 0.69 );
    }
    @Bean(name = "pineapple")
    public Topping getPineapple(){return new Topping("Pineapple", 24, 0.79 );
    }

    @Bean(name = "salami pizza")
    public SalamiPizza getSalamiPizza(){return new SalamiPizza(getCheese(),"tomato",getSalami() ,1160, 5.99 );
    };
    @Bean(name = "hawaiian pizza")
    public HawaiianPizza getHawaiianPizza(){return new HawaiianPizza(List.of(getPineapple(), getHam()),"tomato", 1160, 5.99);
    };

    @Bean(name = "menu")
    public Menu getMenu(){
        List<Drink> drinks = new ArrayList<>();
        drinks.add(getLemonade());
        drinks.add(getWater());
        drinks.add(getWine());
        List<Margherita> pizzas = new ArrayList<>();
        pizzas.add(getHawaiianPizza());
        pizzas.add(getSalamiPizza());
        List<Topping> topping = new ArrayList<>();
        topping.add(getCheese());
        topping.add(getSalami());
        topping.add(getHam());
        topping.add(getOnions());
        topping.add(getPineapple());
        return new Menu(drinks, topping, pizzas);
    }



}
