package products;

import interfaces.IPlay;

public class Violin extends Product implements IPlay {

    private String bowMaterial;

    public Violin(String colour, String make, String material, InstrumentType type, double costPrice, double retailPrice, String bowMaterial) {
        super(colour, make, material, type, costPrice, retailPrice);
        this.bowMaterial = bowMaterial;
    }


    @Override
    public String play() {
        return "Screeching sound";
    }
}
