package monitors;

public class Monitor implements Comparable <Monitor> {
    private double diagonal;
    private int height;
    private int width;

    public Monitor(double diagonal, int width, int height) {
        this.diagonal = diagonal;
        this.width = width;
        this.height = height;
    }

    public int getResolution() {
        return width * height;
    }

    @Override
    public int compareTo(Monitor o) {
        return this.getResolution() - o.getResolution();
    }

    @Override
    public String toString() {
        return width + " x " + height + " pixels ";
    }
}
