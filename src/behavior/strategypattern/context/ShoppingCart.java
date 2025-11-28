package behavior.strategypattern.context;

import behavior.strategypattern.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        int amount = 0;
        for (Item item : items) {
            amount += item.getPrice();
        }
        this.paymentStrategy.pay(amount);
    }
}
