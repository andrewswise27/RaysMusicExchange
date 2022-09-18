package products;

import interfaces.IPlay;

public class Trombone extends Product implements IPlay {

    public int lengthOfShaft;

    public Trombone(String colour, String make, String material, InstrumentType type, double costPrice, double retailPrice, int lengthOfShaft) {
        super(colour, make, material, type, costPrice, retailPrice);
        this.lengthOfShaft = lengthOfShaft;
    }


    @Override
    public String play() {
        return "waaap waaaap";
    }
}
