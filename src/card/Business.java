package card;

public class Business extends Card {
    private int count;

    public Business(String cardHoldersName, String code, int amount, int expirationYear) {
        super(cardHoldersName, code, amount, expirationYear);
    }

    public void setAMillion() {
        setAmount(getAmount() + 1000000);
        count++;
        if (count != 1) {
            System.out.println("Error!");
            System.exit(1);
        }
    }

    @Override
    public void onlinePurchase(double payment) {
        super.onlinePurchase(payment);
        setAmount(getAmount() + payment * 0.1);
    }
}

