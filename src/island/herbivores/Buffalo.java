package island.herbivores;

public class Buffalo extends Herbivore {

    private final double WEIGHT = 700;
    private final int MAX_SPEED = 3;
    private final double MAX_SATIETY = 100;
    private double ACTUAL_SATIETY;
    private final byte EATING_PROBABILITY_INDEX = 12;
    private final String name = "Buffalo";

    public double getWEIGHT() { return WEIGHT;}

    public int getMAX_SPEED() { return MAX_SPEED;}

    public double getMAX_SATIETY() { return MAX_SATIETY;}

    public double getACTUAL_SATIETY() { return ACTUAL_SATIETY;}

    public byte getEATING_PROBABILITY_INDEX() { return EATING_PROBABILITY_INDEX;}

    public String getName() { return name;}
}
