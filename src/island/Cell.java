package island;

import island.herbivores.*;
import island.predators.*;
import island.settings.Settings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class Cell {

    // ЮРА ПРОСТИ ! :\

    private static final Integer WOLFES_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Wolf.class.getName()) + 1);
    private static final Integer FOXES_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Fox.class.getName()) + 1);
    private static final Integer EAGLES_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Eagle.class.getName()) + 1);
    private static final Integer BOAS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Boa.class.getName()) + 1);
    private static final Integer BEARS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Bear.class.getName()) + 1);
    private static final Integer SHEEPS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Sheep.class.getName()) + 1);
    private static final Integer RABBIT_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Rabbit.class.getName()) + 1);
    private static final Integer MOUSES_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Mouse.class.getName()) + 1);
    private static final Integer HORSES_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Horse.class.getName()) + 1);
    private static final Integer GOATS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Goat.class.getName()) + 1);
    private static final Integer DUCKS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Duck.class.getName()) + 1);
    private static final Integer DEERS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Deer.class.getName()) + 1);
    private static final Integer CATERPILLARS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Caterpillar.class.getName()) + 1);
    private static final Integer BUFFALOS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Buffalo.class.getName()) + 1);
    private static final Integer BOARS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Boar.class.getName()) + 1);
    private static final Integer PLANTS_ON_CELL = ThreadLocalRandom.current().
            nextInt(1, Settings.getMaxEntityCountOnCell().get(Plants.class.getName()) + 1);


//    static List<Object> cellComposition = Collections.synchronizedList(new ArrayList<>());

    ArrayList<Object> generateCell() {

        ArrayList<Object> cellComposition = new ArrayList<>();

        for (int i = 0; i < WOLFES_ON_CELL; i++) {
            cellComposition.add(new Wolf());
        }

        for (int i = 0; i < FOXES_ON_CELL; i++) {
            cellComposition.add(new Fox());
        }

        for (int i = 0; i < EAGLES_ON_CELL; i++) {
            cellComposition.add(new Eagle());
        }

        for (int i = 0; i < BOAS_ON_CELL; i++) {
            cellComposition.add(new Boa());
        }

        for (int i = 0; i < BEARS_ON_CELL; i++) {
            cellComposition.add(new Bear());
        }

        for (int i = 0; i < SHEEPS_ON_CELL; i++) {
            cellComposition.add(new Sheep());
        }

        for (int i = 0; i < RABBIT_ON_CELL; i++) {
            cellComposition.add(new Rabbit());
        }

        for (int i = 0; i < MOUSES_ON_CELL; i++) {
            cellComposition.add(new Mouse());
        }

        for (int i = 0; i < HORSES_ON_CELL; i++) {
            cellComposition.add(new Horse());
        }

        for (int i = 0; i < GOATS_ON_CELL; i++) {
            cellComposition.add(new Goat());
        }

        for (int i = 0; i < DUCKS_ON_CELL; i++) {
            cellComposition.add(new Duck());
        }

        for (int i = 0; i < DEERS_ON_CELL; i++) {
            cellComposition.add(new Deer());
        }

        for (int i = 0; i < CATERPILLARS_ON_CELL; i++) {
            cellComposition.add(new Caterpillar());
        }

        for (int i = 0; i < BUFFALOS_ON_CELL; i++) {
            cellComposition.add(new Buffalo());
        }

        for (int i = 0; i < BOARS_ON_CELL; i++) {
            cellComposition.add(new Boar());
        }

        for (int i = 0; i < PLANTS_ON_CELL; i++) {
            cellComposition.add(new Plants());
        }

        return cellComposition;
    }
}
