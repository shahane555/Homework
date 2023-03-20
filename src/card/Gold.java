package card;

public class Gold extends Card {
    private int amountForLunch;

    public Gold(String cardHoldersName, String code, int amount) {
        super(cardHoldersName, code, amount);
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
}
