package part2;

public class Sport {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman(55, 63, 95, 84, 70);
        Sportsman sportsman2 = new Sportsman(84, 55, 80, 94, 100, 88, 70);
        Sportsman sportsman3 = new Sportsman(50, 60, 70);
        Sportsman sportsman4 = new Sportsman(55, 55);
        System.out.println("Average points collected by the sportsmans below are ");
        double[] arr = {sportsman1.getAverageOfPoints(), sportsman2.getAverageOfPoints(), sportsman3.getAverageOfPoints(), sportsman4.getAverageOfPoints()};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Sportsman No" + (i + 1) + " " + arr[i]);
        }
        System.out.println(sportsman1.compareAveragePoints(sportsman1.getAverageOfPoints(), sportsman2.getAverageOfPoints()));
    }
}

class Sportsman {
    private int[] collectedPoints;

    Sportsman(int... collectedPoints) {

        setCollectedPoints(collectedPoints);
    }

    public void setCollectedPoints(int... collectedPoints) {
        int counter = 0;
        for (int i = 0; i < collectedPoints.length; i++) {
            if (collectedPoints[i] >= 50 && collectedPoints[i] <= 100) {
                counter++;
            }
        }
        if (counter == collectedPoints.length) {
            this.collectedPoints = collectedPoints;
        } else {
            System.out.println("One of your inputs is out of [50, 100] range");
            System.exit(1);
        }
    }

    public double getAverageOfPoints() {
        double result = 0;
        for (int i = 0; i < collectedPoints.length; i++) {
            result += collectedPoints[i];
        }
        return result / collectedPoints.length;
    }

    public int compareAveragePoints(double points1, double points2) {
        if (points1 > points2) {
            return 1;
        } else if (points1 < points2) {
            return -1;
        }
        return 0;
    }
}