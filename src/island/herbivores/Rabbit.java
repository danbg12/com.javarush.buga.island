package island.herbivores;

public class Rabbit extends Herbivore {

    private final double WEIGHT = 2;
    private final int MAX_SPEED = 2;
    private final double MAX_SATIETY = 0.45;
    private double ACTUAL_SATIETY;
    private final byte EATING_PROBABILITY_INDEX = 7;
    private final String name = "Rabbit";

    public double getWEIGHT() { return WEIGHT;}

    public int getMAX_SPEED() { return MAX_SPEED;}

    public double getMAX_SATIETY() { return MAX_SATIETY;}

    public double getACTUAL_SATIETY() { return ACTUAL_SATIETY;}

    public byte getEATING_PROBABILITY_INDEX() { return EATING_PROBABILITY_INDEX;}

    public String getName() { return name;}
}
