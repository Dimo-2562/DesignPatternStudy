package strategypattern.strategy;

public class MobilePayStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public MobilePayStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Won paid using Mobile Pay");
    }
}
