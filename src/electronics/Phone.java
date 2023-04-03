package electronics;

public abstract class Phone extends ElectronicDevices {
    public Phone(String manufacturer, String model, double costPrice, double sellingPrice) {
        super(manufacturer, model, costPrice, sellingPrice);
    }

    @Override
    public void areUsedFor() {
        System.out.println("This device enables the user to make and receive calls");
    }

    public abstract void makeCalls();
}
