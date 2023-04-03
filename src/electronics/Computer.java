package electronics;

import card.Card;

public abstract class Computer extends ElectronicDevices {
    private String ram;
    private String os;

    public Computer(String manufacturer, String model, double costPrice, double sellingPrice, String ram, String os) {
        super(manufacturer, model, costPrice, sellingPrice);
        this.ram = ram;
        this.os = os;
    }

    @Override
    public void areUsedFor() {
        System.out.println("This device has the ability to store, retrieve and process data.");
    }

    public abstract void processData();

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
