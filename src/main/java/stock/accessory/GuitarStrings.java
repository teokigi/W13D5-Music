package stock.accessory;

public class GuitarStrings extends Accessories{

    private final String description;

    public GuitarStrings(String type, double buyPrice, double sellPrice) {
        super(type, buyPrice, sellPrice);
        this.description = "Pack of 6 guitar strings";
    }

    public String getDescription(){
        return this.description;
    }

}
