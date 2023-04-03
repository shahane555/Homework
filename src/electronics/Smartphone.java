package electronics;

public class Smartphone extends Phone {
    private String camera;
    private String memory;
    private String os;

    public Smartphone(String manufacturer, String model, double costPrice, double sellingPrice, String camera, String memory, String  os) {
        super(manufacturer, model, costPrice, sellingPrice);
        this.camera = camera;
        this.memory = memory;
        this.os = os;
    }

    @Override
    public void makeCalls() {
        System.out.println("A smartphone is a cellular phone with an integrated computer and other features " +
                "not associated with telephones such as an operating system, web browsing and the ability to " +
                "run software applications");
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
