package island;

import island.settings.Eatable;

public class Plants implements Eatable {

    private final double WEIGHT = 1;
    private final byte EATING_PROBABILITY_INDEX = 15;
    private final String name = "Plants";

    public double getWEIGHT() { return WEIGHT;}

    public byte getEATING_PROBABILITY_INDEX() { return EATING_PROBABILITY_INDEX;}

    public String getName() { return name;}
}
