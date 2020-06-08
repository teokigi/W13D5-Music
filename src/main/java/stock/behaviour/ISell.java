package stock.behaviour;

public interface ISell {
    String itemType(ISell isell);
    double buyPrice(ISell isell);
    double sellPrice(ISell isell);
}
