package electronics;

public class DesktopComputer extends Computer {
    public DesktopComputer(String manufacturer, String model, double costPrice, double sellingPrice, String ram, String os) {
        super(manufacturer, model, costPrice, sellingPrice, ram, os);
    }

    public void processData() {
        System.out.println("This device is a static, stationary computer, designed to be placed on a desk, " +
                "consists of a computer case, monitor, keyboard and mouse");
    }
}
