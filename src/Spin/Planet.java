package Spin;

public class Planet implements Spinable {

    @Override
    public void spin() {
        System.out.println("All planets spin");
    }

    @Override
    public void moveInACircle() {
        System.out.println("All planets move in a circle around the Sun");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Each planet spins around its' axis");
    }

    @Override
    public void unstoppableSpinning() {
        System.out.println("The planet's spinning is unstoppable process");
    }
}
