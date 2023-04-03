package electronics;

public class Earbuds extends EarPhones {
    public Earbuds(String manufacturer, String model, double costPrice, double sellingPrice) {
        super(manufacturer, model, costPrice, sellingPrice);
    }

    @Override
    public void listeningAudioPrivately() {
        System.out.println("This device is a pair of tiny wireless speakers that user wears  inside his ears");
    }
}
