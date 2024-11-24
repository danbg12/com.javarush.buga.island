package island.herbivores;

public class Boar extends Herbivore {

    private final double WEIGHT = 400;
    private final int MAX_SPEED = 2;
    private final double MAX_SATIETY = 50;
    private double ACTUAL_SATIETY;
    private final byte EATING_PROBABILITY_INDEX = 11;
    private final String name = "Boar";

    public double getWEIGHT() { return WEIGHT;}

    public int getMAX_SPEED() { return MAX_SPEED;}

    public double getMAX_SATIETY() { return MAX_SATIETY;}

    public double getACTUAL_SATIETY() { return ACTUAL_SATIETY;}

    public byte getEATING_PROBABILITY_INDEX() { return EATING_PROBABILITY_INDEX;}

    public String getName() { return name;}
}
