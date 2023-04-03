package electronics;

public abstract class EarPhones extends ElectronicDevices {
    public EarPhones(String manufacturer, String model, double costPrice, double sellingPrice) {
        super(manufacturer, model, costPrice, sellingPrice);
    }

    @Override
    public void areUsedFor() {
        System.out.println("This devise lets a single user listen to audio signals (such as music or speech) privately ");
    }

    public abstract void listeningAudioPrivately();

    private void bb() {

    }
}
