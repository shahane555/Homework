package card;

public class Business extends Card {
    private int count;

    public Business(String cardHoldersName, String code, int amount) {
        super(cardHoldersName, code, amount);
    }

    public void setAMillion() {
        setAmount(getAmount() + 1000000);
        count++;
        if (count != 1) {
            System.out.println("Error!");
            System.exit(1);
        }
    }
}

