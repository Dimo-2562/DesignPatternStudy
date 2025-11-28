package strategypattern;

import strategypattern.context.Item;
import strategypattern.context.ShoppingCart;
import strategypattern.strategy.MasterCardStrategy;
import strategypattern.strategy.MobilePayStrategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Macbook Pro", 10000));
        cart.addItem(new Item("IPhone", 2000));

        cart.setPaymentStrategy(new MasterCardStrategy("Dmori", "1234-1234-1234-1234", "123"));
        cart.pay();

        cart.setPaymentStrategy(new MobilePayStrategy("example@naver.com", "12345"));
        cart.pay();
    }
}
