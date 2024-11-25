package island;

import island.setting.Eatable;

public abstract class Animal implements Eatable {

    public static double WEIGHT;
    public int MAX_SPEED;
    public double MAX_SATIETY;
    public double ACTUAL_SATIETY;
    public byte EATING_PROBABILITY_INDEX;

    public abstract void eat(Eatable eatable);

    public abstract void move();

    public abstract void reproduce();

    public abstract void die();
}
