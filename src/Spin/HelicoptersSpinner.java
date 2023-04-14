package Spin;

public class HelicoptersSpinner implements Spinable {
    @Override
    public void spin() {
        System.out.println("Helicopter's spinner is able to spin");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Helicopter's spinner spins around its' axis");
    }
}
