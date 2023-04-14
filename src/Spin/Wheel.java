package Spin;

public class Wheel implements Spinable {
    @Override
    public void spin() {
        System.out.println("Wheels are able to spin");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Wheels spin around their axis");
    }
}
