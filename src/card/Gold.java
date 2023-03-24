package card;

public class Gold extends Card {
    private int amountForLunch;
    private int bonusPoints;

    public Gold(String cardHoldersName, String code, int amount, int expirationYear) {
        super(cardHoldersName, code, amount, expirationYear);
        amountForLunch = 100000;
    }

    public int getAmountForLunch() {
        return amountForLunch;
    }

    public void paymentForLunch(int payment) {
        if (payment > 0 && payment <= amountForLunch) {
            amountForLunch -= payment;
        } else {
            System.out.println("Error!");
            System.exit(1);
        }
    }

    @Override
    public void withdrawMoney(int money) {
        if (money > 0 && money <= getAmount()) {
            setAmount(getAmount() - money);
            bonusPoints += 2;
        }
    }
}
