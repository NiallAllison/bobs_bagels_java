import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.ir.debug.ObjectSizeCalculator.getObjectSize;

public class Basket {
    List<Bagel> basketItem = new ArrayList<Bagel>();
    int Capacity;

    public Basket(int capacity) {
        Object[] basketItem = {};
        Capacity = capacity;
    }
    public Basket() {
        Capacity = 3;
    }

    public int getCapacity() {
        return Capacity;
    }
    public void add(Bagel item) {
        basketItem.add(item);
    }

    public List<Bagel> getBasketItem() {
        return basketItem;
    }

    public void remove(Bagel item) {
        int indexOfItem = basketItem.indexOf(item);
        basketItem.remove(indexOfItem);
    }

}
