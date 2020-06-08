package stock.instrument;

import stock.behaviour.IPlay;

public class Guitar extends Instruments implements IPlay {

    private final String specifications;

    public Guitar(String type, double buyPrice, double sellPrice) {
        super(type, buyPrice, sellPrice);
        this.specifications = "6 string";
    }

    public String play(){
        return "Plucks the G-string";
    }

}
