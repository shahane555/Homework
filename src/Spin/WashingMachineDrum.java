package Spin;

public class WashingMachineDrum implements Spinable {
    @Override
    public void spin() {
        System.out.println("Washing machine drum is able to spin");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Washing machine drum spins around its' axis");
    }
}
