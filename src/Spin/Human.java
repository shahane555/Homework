package Spin;

public class Human implements Spinable {
    @Override
    public void spin() {
        System.out.println("Humans are able to spin");
    }

    @Override
    public void moveInACircle() {
        System.out.println("Humans can move in a circle");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Humans can rotate around their axis");
    }
}
