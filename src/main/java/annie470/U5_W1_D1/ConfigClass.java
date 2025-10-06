package annie470.U5_W1_D1;

import annie470.U5_W1_D1.entities.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
