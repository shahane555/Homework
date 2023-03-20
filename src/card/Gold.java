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
}
