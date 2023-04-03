package electronics;

public class Headphones extends EarPhones {

    public Headphones(String manufacturer, String model, double costPrice, double sellingPrice) {
        super(manufacturer, model, costPrice, sellingPrice);
    }

    @Override
    public void listeningAudioPrivately() {
        System.out.println("This device is a pair of earphones joined by a band");
    }
}
