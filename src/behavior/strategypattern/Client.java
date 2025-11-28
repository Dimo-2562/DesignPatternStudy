package behavior.strategypattern;

import behavior.strategypattern.context.Item;
import behavior.strategypattern.context.ShoppingCart;
import behavior.strategypattern.strategy.MasterCardStrategy;
import behavior.strategypattern.strategy.MobilePayStrategy;

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
