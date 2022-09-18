package products;

import interfaces.IPlay;

public class AcousticGuitar extends Product implements IPlay {

    private int numOfStrings;

    public AcousticGuitar(String colour, String make, String material, InstrumentType type, double costPrice, double retailPrice, int numOfStrings) {
        super(colour, make, material, type, costPrice, retailPrice);
        this.numOfStrings = numOfStrings;
    }


    @Override
    public String play() {
        return "Strumming sounds";
    }
}
