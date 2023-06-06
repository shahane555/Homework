package triangles;

public class Triangle {
    private Coordinate a;
    private Coordinate b;
    private Coordinate c;

    public Triangle(Coordinate a, Coordinate b, Coordinate c) {
        if ((a.getX() == b.getX() && a.getY() == b.getY()) ||
                (b.getX() == c.getX() && b.getY() == c.getY()) ||
                (a.getX() == c.getX() && a.getY() == c.getY())) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "( " + a + ", " + b + ", " + c + " )";
    }
}
