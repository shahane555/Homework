package card;

public class Card {
    private String cardHoldersName;
    private String code;
    private double amount;
    private int expirationYear;

    Card(String cardHoldersName, String code, double amount, int expirationYear) {
        setCardHoldersName(cardHoldersName);
        setCode(code);
        setAmount(amount);
        setExpirationYear(expirationYear);
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Error!");
            System.exit(1);
        }
    }

    public void addMoney(int money) {
        if (money > 0) {
            amount += money;
        }
    }

    public void withdrawMoney(int money) {
        if (money > 0 && money <= amount) {
            amount -= money;
        }
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        if (expirationYear >= 2023 && expirationYear <= 2028) {
            this.expirationYear = expirationYear;
        } else {
            System.out.println("Expiration year is invalid");
            System.exit(1);
        }
    }

    public void onlinePurchase(double payment) {
        if (payment > 0 && payment <= amount) {
            amount -= payment;
            System.out.println("Your online payment was completed successfully");
        } else {
            System.out.println("You don't have enough balance to complete your payment");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Cardholder's name is " + cardHoldersName + "\n" + "The code is " + code + "\n" + "Expiration year is " + expirationYear;
    }
}