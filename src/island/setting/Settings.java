package island.setting;

import island.Plants;
import island.herbivore.*;
import island.predator.*;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    //Eating or be eaten probability for all animals
    private static int[][] eatingProbability = {{0, 0, 0, 0, 0, 10, 15, 60, 80, 60, 70, 15, 10, 40, 0, 0},
                                 {0, 0, 15, 0, 0, 0, 0, 20, 40, 0, 0, 0, 0, 10, 0, 0},
                                 {0, 0, 0, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40, 0},
                                 {0, 80, 0, 0, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0, 0},
                                 {0, 0, 10, 0, 0, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0, 0},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 90, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100},
                                 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100}};

    // Map with maximal count of each type of animal in one cell
    private static Map<String , Integer> maxEntityCountOnCell = new HashMap<>();

    static {
        maxEntityCountOnCell.put(Wolf.class.getName(), 30);
        maxEntityCountOnCell.put(Boa.class.getName() , 30);
        maxEntityCountOnCell.put(Fox.class.getName() , 30);
        maxEntityCountOnCell.put(Eagle.class.getName(), 20);
        maxEntityCountOnCell.put(Bear.class.getName() , 5);
        maxEntityCountOnCell.put(Horse.class.getName() , 20 );
        maxEntityCountOnCell.put(Deer.class.getName() , 20);
        maxEntityCountOnCell.put(Rabbit.class.getName(), 150);
        maxEntityCountOnCell.put(Mouse.class.getName(), 500);
        maxEntityCountOnCell.put(Goat.class.getName() , 140);
        maxEntityCountOnCell.put(Sheep.class.getName(), 140);
        maxEntityCountOnCell.put(Boar.class.getName() , 50);
        maxEntityCountOnCell.put(Buffalo.class.getName() , 10);
        maxEntityCountOnCell.put(Duck.class.getName(), 200);
        maxEntityCountOnCell.put(Caterpillar.class.getName(), 1000);
        maxEntityCountOnCell.put(Plants.class.getName() , 200);
    }

    public static Map<String, Integer> getMaxEntityCountOnCell() { return maxEntityCountOnCell;}

    public static int[][] getEatingProbability() { return eatingProbability;}
}
