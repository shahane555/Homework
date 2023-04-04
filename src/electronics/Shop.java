package electronics;

import card.Gold;
import card.Cards;

public class Shop {
    public static void main(String[] args) {
        ElectronicDevices e = new DesktopComputer("LG", "29V950-A.AA5SU1", 450, 550, "8 GB", "Windows 10");
        ElectronicDevices l = new Laptop("Lenovo", "8VUL0086", 300, 430, "4 GB", "Windows 11 S");
        ElectronicDevices s = new Smartphone("Samsung", "Galaxy s23", 650, 760, "50 MP", "256 GB", "Android 13.0");
        ElectronicDevices h = new Headphones("Philips", "H8506", 100, 150);
        ElectronicDevices e2 = new Earbuds("Sony", "WF - 1000XM4", 80, 100);

        System.out.println(ElectronicDevices.totalIncome(e, l, s, h, e2));
        double a = s.payWithCard(new Gold("Name Surname", "12345678", 1000, 2024));
        System.out.println(a);
    }
}

