package products;


import interfaces.ISell;

public abstract class Product implements ISell {

    private String colour;
    private String make;
    private String material;
    private InstrumentType type;
    private double costPrice;
    private double retailPrice;

    public Product(String colour, String make, String material, InstrumentType type, double costPrice, double retailPrice) {
        this.colour = colour;
        this.make = make;
        this.material = material;
        this.type = type;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public double markUp() {
        return this.retailPrice - this.costPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public InstrumentType getType() {
        return type;
    }
}
