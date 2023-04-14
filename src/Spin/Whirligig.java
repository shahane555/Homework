package Spin;

public class Whirligig implements Spinable { // Հոլ
    @Override
    public void spin() {
        System.out.println("Whirligig can spin");
    }

    @Override
    public void moveInACircle() {
        System.out.println("Whirligig can spin while spinning around its' axis");
    }

    @Override
    public void spinAroundAxis() {
        System.out.println("Whirligig can spin around its' axis");
    }
}
