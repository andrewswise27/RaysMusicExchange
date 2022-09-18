package products;

import interfaces.IPlay;

public class Piano extends Product implements IPlay {

    private String keyMaterial;

    public Piano(String colour, String make, String material, InstrumentType type, double costPrice, double retailPrice, String keyMaterial) {
        super(colour, make, material, type, costPrice, retailPrice);
        this.keyMaterial = keyMaterial;
    }


    @Override
    public String play() {
        return "Piano sounds";
    }
}
