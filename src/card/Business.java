package card;

public class Business extends Card {
    private int additionalAccount;
    private int count;

    public Business(String cardHoldersName, String code, int amount) {
        super(cardHoldersName, code, amount);
    }

    public int getAdditionalAccount() {
        return additionalAccount;
    }

    public void setAdditionalAccount(int additionalAccount) {
        if (additionalAccount == 1000000) {
            count++;
        }
        if (count == 1) {
            this.additionalAccount = additionalAccount;
        } else {
            System.out.println("You can only charge your additional account once");
            System.exit(1);
        }
    }
}

