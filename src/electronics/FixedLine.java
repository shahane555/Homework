package electronics;

public class FixedLine extends Phone {
    public FixedLine(String manufacturer, String model, double costPrice, double sellingPrice) {
        super(manufacturer, model, costPrice, sellingPrice);
    }

    @Override
    public void makeCalls() {
        System.out.println("This device uses metal wires or optical fiber telephone line for transmission");
    }
}
