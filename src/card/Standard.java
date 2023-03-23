package card;

public class Standard extends Card {
    Standard(String cardHoldersName, String code, int amount, int expirationYear) {
        super(cardHoldersName, code, amount, expirationYear);
    }

    @Override
    public String toString() {
        return "";
    }
}

