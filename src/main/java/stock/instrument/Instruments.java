package stock.instrument;

import stock.behaviour.ISell;

public abstract class Instruments implements ISell {

    private final String type;
    private final double buyPrice;
    private final double sellPrice;
    private final double percentageMarkup;

    public Instruments(String type, double buyPrice, double sellPrice){
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.percentageMarkup = ((sellPrice - buyPrice) / buyPrice) * 100;
    }

    public String itemType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getPercentageMarkup() {
        return percentageMarkup;
    }
}
