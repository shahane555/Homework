package electronics;

public class Shop {
    private ElectronicDevices[] electronicDevices;

    Shop(ElectronicDevices... electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    public static void compareTwoDevices(ElectronicDevices obj1, ElectronicDevices obj2) {
        if (obj1.getCostPrice() > obj2.getCostPrice()) {
            System.out.println("The first device is more expensive than the second");
        } else if (obj1.getCostPrice() < obj2.getCostPrice()) {
            System.out.println("The first device is cheaper than the second");
        } else {
            System.out.println("Both devices have the same price");
        }
    }
}
