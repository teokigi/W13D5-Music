package stock.accessory;

import stock.instrument.Instruments;

public abstract class Accessories extends Instruments {

    public Accessories(String type, double buyPrice, double sellPrice) {
        super(type, buyPrice, sellPrice);
    }
}
