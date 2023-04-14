package Spin;

public class ClockHands implements Spinable {
    @Override
    public void spin() {
        System.out.println("Clock hands are able to spin");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Clock hands spin around their axis");
    }
}
