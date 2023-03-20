package card;

public class Card {
    private String cardHoldersName;
    private String code;
    private int amount;


    Card(String cardHoldersName, String code, int amount) {
        setCardHoldersName(cardHoldersName);
        setCode(code);
        setAmount(amount);
    }

    public String getCardHoldersName() {
        return cardHoldersName;
    }

    public void setCardHoldersName(String cardHoldersName) {
        this.cardHoldersName = cardHoldersName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Error!");
            System.exit(1);
        }
    }

    public void addMoney (int money) {
        if (money > 0 ) {
            amount += money;
        }
    }

    public void getMoney (int money) {
        if (money > 0 && money <= amount) {
            amount -= money;
        }
    }
}