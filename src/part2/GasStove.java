package part2;

public class GasStove {
    public static void main(String[] args) {
        Stove newStove = new Stove(1, 3, "Glass", "Electrolux");
        newStove.electricBurnerOn = true;
        newStove.gasBurnerOn = true;
        if (newStove.getGasStoveEnergy() == 0) {
            System.out.println("To get the total energy generated from the gas stove switch on all electric burners and all gas burners");
        } else {
            System.out.println("The total energy generated from the gas stove is " + newStove.getGasStoveEnergy());
        }
    }
}

class Stove {
    public boolean electricBurnerOn = false;
    public boolean gasBurnerOn = false;
    private int electricBurner;
    private int gasBurner;
    String panelCover;
    String manufacturer;

    public Stove(int electricBurner, int gasBurner, String panelCover, String manufacturer) {
        setElectricBurner(electricBurner);
        setGasBurner(gasBurner);
        this.panelCover = panelCover;
        this.manufacturer = manufacturer;
    }

    public void setElectricBurner(int electricBurner) {
        if (electricBurner >= 1 && electricBurner <= 3) {
            this.electricBurner = electricBurner;
        } else {
            System.out.println("Invalid input, gas stove should have minimum 1, maximum 3 electric burners");
            System.exit(1);
        }
    }

    public void setGasBurner(int gasBurner) {
        if (gasBurner >= 3 && gasBurner <= 5) {
            this.gasBurner = gasBurner;
        } else {
            System.out.println("Invalid input, gas stove should have minimum 3, maximum 5 gas burners");
            System.exit(1);
        }
    }

    public int getElectricBurner() {
        return electricBurner;
    }

    public int getGasBurner() {
        return gasBurner;
    }

    public int getGasStoveEnergy() {
        if (electricBurnerOn && gasBurnerOn) {
            return getElectricBurner() * 100 + getGasBurner() * 80;
        }
        return 0;
    }
}
