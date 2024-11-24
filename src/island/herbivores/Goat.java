package island.herbivores;

public class Goat extends Herbivore {

    private final double WEIGHT = 60;
    private final int MAX_SPEED = 3;
    private final double MAX_SATIETY = 10;
    private double ACTUAL_SATIETY;
    private final byte EATING_PROBABILITY_INDEX = 9;
    private final String name = "Goat";

    public double getWEIGHT() { return WEIGHT;}

    public int getMAX_SPEED() { return MAX_SPEED;}

    public double getMAX_SATIETY() { return MAX_SATIETY;}

    public double getACTUAL_SATIETY() { return ACTUAL_SATIETY;}

    public byte getEATING_PROBABILITY_INDEX() { return EATING_PROBABILITY_INDEX;}

    public String getName() { return name;}
}
