package practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        List<Products> products = new ArrayList<>(30);
        products.add(new Products("book", "stationary", Arrays.asList("diwali discount", "Out of Stock"), 500, 20000));
        products.add(new Products("ps5", "Electronics", Arrays.asList(), 50000, 5));
        products.add(new Products("A4 sheets", "stationary", Arrays.asList(), 9, 12000));
        products.add(new Products("iphone", "Electronics", Arrays.asList("Instant Cashback"), 70000, 600));
        products.add(new Products("pen", "stationary", Arrays.asList("diwali discount"), 50, 3000));
        products.add(new Products("Towels", "Clothing", Arrays.asList(), 0, 100));
        products.add(new Products("printer", "Electronics", Arrays.asList("diwali discount"), 12000, 50));
        products.add(new Products("RC car", "Electronics", Arrays.asList(), 0, 20));
        products.stream().forEach(inventory::addProductToInventory);
        /*Inventory wrongPrizingInv = inventory.productsPrizedZero();
        wrongPrizingInv.Print();*/
        inventory.productsByCategory();
    }
}
