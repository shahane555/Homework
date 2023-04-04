package electronics;

import card.Card;

public abstract class ElectronicDevices {
    private String manufacturer;
    private String model;
    private double costPrice;
    private double sellingPrice;

    public ElectronicDevices(String manufacturer, String model, double costPrice, double sellingPrice) {
        setManufacturer(manufacturer);
        setModel(model);
        setCostPrice(costPrice);
        setSellingPrice(sellingPrice);
    }

    public abstract void areUsedFor();

    public double earning() {
        return sellingPrice - costPrice;
    }

    public double payWithCard(Card ob) {
        if (ob.getAmount() > 0 && ob.getAmount() >= sellingPrice) {
            ob.setAmount(ob.getAmount() - sellingPrice);
        }
        return ob.getAmount();
    }

    public static double totalIncome(ElectronicDevices... devices) {
        double sum = 0;
        for (ElectronicDevices d : devices) {
            sum += d.earning();
        }
        System.out.println("Total income ");
        return sum;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        if (costPrice > 0) {
            this.costPrice = costPrice;
        } else {
            System.out.println("Invalid cost price!");
        }
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice > 0) {
            this.sellingPrice = sellingPrice;
        } else {
            System.out.println("Invalid selling price!");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
