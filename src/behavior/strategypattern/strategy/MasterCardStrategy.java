package behavior.strategypattern.strategy;

public class MasterCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;

    public MasterCardStrategy(String name, String cardNumber, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Won paid using Master Card");
    }
}
