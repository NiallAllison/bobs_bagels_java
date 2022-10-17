import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Bagel> basketItem = new ArrayList<Bagel>();
    private int Capacity;

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
        if (capChecker() == false && !basketItem.contains(item)) { basketItem.add(item); }
    }

    public List<Bagel> getBasketItem() {
        return basketItem;
    }


    public void remove(Bagel item) {
        if (basketItem.contains(item) == false){ return; }
        int indexOfItem = basketItem.indexOf(item);
        basketItem.remove(indexOfItem);
    }

}
