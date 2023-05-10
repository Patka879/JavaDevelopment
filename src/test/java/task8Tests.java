import org.example.advancedDevelopment.task8.Basket;
import org.example.advancedDevelopment.task8.BasketEmptyException;
import org.example.advancedDevelopment.task8.BasketFullException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class task8Tests {
    @Test
    public void testRemovingFromEmptyBasket()  {
        Basket<String> basket = new Basket();
    }
}
