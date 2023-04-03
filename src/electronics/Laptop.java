package electronics;

public class Laptop extends Computer {
    public Laptop(String manufacturer, String model, double costPrice, double sellingPrice, String ram, String os) {
        super(manufacturer, model, costPrice, sellingPrice, ram, os);
    }

    public void processData() {
        System.out.println("This is a small, portable personal computer");
    }
}
