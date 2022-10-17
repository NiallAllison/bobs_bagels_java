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

    @Test@DisplayName("Cannot exceed capacity")

    void capChecker(){
        //arrange
        Basket newBasket = new Basket(0);

        //act
        Bagel newBagel = new Bagel();
        newBasket.add(newBagel);

        //assert
        assertFalse(newBasket.getBasketItem().contains(newBagel));

        //clean-up
        newBasket = null;
        newBagel = null;
    }

    @Test
    @DisplayName("Cannot remove item if not in basket")

    void keepingMySanity() {
        //arrange
        Basket newBasket = new Basket(3);
        Bagel newBagel = new Bagel();
        Bagel testBagel = new Bagel();
        Bagel anotherBagel = new Bagel();

        //act
        newBasket.add(testBagel);
        newBasket.add(anotherBagel);
        newBasket.remove(newBagel);
        int actual = newBasket.getBasketItem().size();

        //assert
        assertFalse(newBasket.getBasketItem().contains(newBagel));
        assertEquals(2, actual);

        //clean
        newBasket = null;
        newBagel = null;
    }

    @Test
    @DisplayName("Cannot remove item if not in basket")

    void keepingMySanityV2(){
        //arrange
        Basket newBasket = new Basket();
        Bagel newBagel = new Bagel();
        newBasket.add(newBagel);

        //act
        newBasket.add(newBagel);
        int expected = 1;
        int actual = newBasket.getBasketItem().size();
        //assert
        assertEquals(expected, actual);

        //clean-up
        newBasket = null;
        newBagel = null;
    }

    @Test
    @DisplayName("get price of bagel")
    void getPrice() {
        //arrange
        double price = 4.99;
        Bagel classicBagel = new Bagel();
        Bagel newBagel = new Bagel(price);

        //act
        double classActual = classicBagel.getPrice();
        double actual = newBagel.getPrice();

        //assert
        assertEquals(3.99, classActual);
        assertEquals(4.99, actual);

        //clean-up
        newBagel = null;
        classicBagel = null;
    }

    @Test
    @DisplayName("Get total of basket")

    void Total(){
        Basket newBasket = new Basket();
        newBasket.add(new Bagel(2.00));
        newBasket.add(new Bagel(3.00));
        newBasket.add(new Bagel(5.00));

        double expected = 10.00;
        double actual = newBasket.getTotal();

        assertEquals(expected, actual);

        newBasket = null;
    }
}
