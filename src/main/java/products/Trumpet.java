package products;

import interfaces.IPlay;

public class Trumpet extends Product implements IPlay {

    public int numOfValves;

    public Trumpet(String colour, String make, String material, InstrumentType type, double costPrice, double retailPrice, int numOfValves) {
        super(colour, make, material, type, costPrice, retailPrice);
        this.numOfValves = numOfValves;
    }


    @Override
    public String play() {
        return "Braaaaap";
    }
}
