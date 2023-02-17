package part2;

public class District {

    public static void main(String[] args) {
        Building b1 = new Building("Monolithic", 5);
        b1.setTwoRooms(2, 5, 6, 7, 9, 12);
        b1.getTwoRooms();
        b1.setThreeRooms(1, 3, 4, 8, 11, 13, 15);
        b1.getThreeRooms();
        Building b2 = new Building("Monolithic", 4);
        b2.setTwoRooms(1, 4, 6, 9);
        b2.getTwoRooms();
        b2.setThreeRooms(3, 9, 11, 15, 21);
        b2.getThreeRooms();

        District2 yeraz = new District2(600, b1, b2);
        System.out.println(yeraz.unitGardenArea());
    }
}

class Building {
    private int floors;
    private int[] twoRooms;
    private int[] threeRooms;
    private String buildingType;


    Building(String buildingType, int floors) {
        setFloors(floors);
        setBuildingType(buildingType);
        twoRooms = new int[getFloors() * 4 / 2];
        threeRooms = new int[getFloors() * 4 / 2];
    }

    public void setBuildingType(String string) {
        if (string.equals("Panel") || string.equals("Monolithic")) {
            this.buildingType = string;
        } else {
            System.out.println("One of your inputs is invalid!");
            System.exit(1);
        }
    }

    public String getBuildingType() {
        return buildingType;
    }


    public void setFloors(int floors) {
        if (floors >= 4 && floors <= 6)
            this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setTwoRooms(int... twoRooms) {
        for (int i = 0; i < twoRooms.length - 1; i++) {               // 9, 13, 23, 4, 6
            for (int j = i + 1; j < twoRooms.length; j++) {
                if (twoRooms[i] > 0 && twoRooms[i] <= getFloors() * 4 && twoRooms[i] != twoRooms[j]) {
                    continue;
                }
                System.out.println("One of your inputs is invalid!");
                System.exit(1);
            }
        }
        this.twoRooms = twoRooms;
    }

    public int[] getTwoRooms() {
        return twoRooms;
    }

    public void setThreeRooms(int... threeRooms) {
        for (int i = 0; i < threeRooms.length - 1; i++) {               // 9 13 23 4 6
            for (int j = i + 1; j < threeRooms.length; j++) {
                if (threeRooms[i] > 0 && threeRooms[i] <= getFloors() * 4 && threeRooms[i] != threeRooms[j]) {
                    continue;
                }
                System.out.println("One of your inputs is invalid!");
                System.exit(1);
            }
        }
        this.threeRooms = threeRooms;
    }

    public int[] getThreeRooms() {
        return threeRooms;
    }
    
}

class District2 {
    private double areaOfGarden;
    Building[] buildings;

    District2(double areaOfGarden, Building... buildings) {
        setAreaOfGarden(areaOfGarden);
        this.buildings = buildings;
    }

    public void setAreaOfGarden(double areaOfGarden) {
        if (areaOfGarden > 50 && areaOfGarden <= 1000) {
            this.areaOfGarden = areaOfGarden;
        } else {
            System.out.println("One of your inputs is invalid!");
            System.exit(1);
        }
    }

    public double getAreaOfGarden() {
        return areaOfGarden;
    }

    public double unitGardenArea() {
        double result = 0;
        for (int i = 0; i < buildings.length; i++) {
            result += buildings[i].getTwoRooms().length + buildings[i].getThreeRooms().length;
        }
        return (double) (areaOfGarden / result);
    }
}

