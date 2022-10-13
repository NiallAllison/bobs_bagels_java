import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
    @Test
    @DisplayName("add bagel")

    void add(){
        //arrange
        Basket newBasket = new Basket();
        Bagel newBagel = new Bagel();
        Bagel newBagel2 = new Bagel();

        //act
        newBasket.add(newBagel);
        newBasket.add(newBagel2);
        int result = newBasket.getBasketItem().size();

        //assert
        assertEquals(2, result);

        //clean-up
        newBasket = null;
        newBagel = null;
        newBagel2 = null;
    }

    @Test
    @DisplayName("remove bagel")

    void remove(){
        //arrange
        Basket newBasket = new Basket();
        Bagel newBagel = new Bagel();
        Bagel newBagel2 = new Bagel();

        //act
        newBasket.add(newBagel);
        newBasket.add(newBagel2);
        newBasket.remove(newBagel);
        int result = newBasket.getBasketItem().size();

        //assert
        assertEquals(1, result);

        //clean-up
        newBasket = null;
        newBagel = null;
        newBagel2 = null;
    }

    @Test
    @DisplayName("set capacity")

    void setCapacity(){
        // arrange
        Basket newBasket = new Basket(1);

        // act
        int result = newBasket.getCapacity();

        // assert
        assertEquals(1, result);

        // clean-up
        newBasket = null;
    }

}
