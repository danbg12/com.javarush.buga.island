package com.javarush.island;
import com.javarush.entity.Animal;
import com.javarush.entity.Plants;
import com.javarush.entity.herbivore.*;
import com.javarush.entity.predator.*;
import com.javarush.util.Texts;
import lombok.Getter;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Getter
public class CellZone implements Runnable {

    private static Texts text = new Texts();
    public CopyOnWriteArrayList<Animal> animalsListOnCell = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Plants> plantsListOnCell = new CopyOnWriteArrayList<>();
    private final Integer coordinateX;
    private final Integer coordinateY;

    public CellZone(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    {
        fillCollectionWithAnimals(new Wolf());
        fillCollectionWithAnimals(new Fox());
        fillCollectionWithAnimals(new Boa());
        fillCollectionWithAnimals(new Bear());
        fillCollectionWithAnimals(new Eagle());
        fillCollectionWithAnimals(new Boar());
        fillCollectionWithAnimals(new Buffalo());
        fillCollectionWithAnimals(new Caterpillar());
        fillCollectionWithAnimals(new Deer());
        fillCollectionWithAnimals(new Duck());
        fillCollectionWithAnimals(new Goat());
        fillCollectionWithAnimals(new Horse());
        fillCollectionWithAnimals(new Mouse());
        fillCollectionWithAnimals(new Rabbit());
        fillCollectionWithAnimals(new Sheep());
        addPlantsOnCell();
    }

    // Method set a random count of entities per cell in range from 1 to maxPerCell
    private static Integer entitiesOnCell(Animal animal) {
        return ThreadLocalRandom.current().nextInt(1, animal.maxPerCell + 1);
    }

    // This method receive entity type and fill the collection with new instances of this entity
    // For all new entities use reflection and count how much animals are in one cell
    private void fillCollectionWithAnimals(Animal animal) {
        for (int i = 0; i < entitiesOnCell(animal); i++) {
            try {
                animalsListOnCell.add(animal.getClass().getDeclaredConstructor().newInstance());

            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(text.getINSTANCE_ERROR());
            }
        }
    }

    // This method add on cell random quantity of plants (in range from 1 to maxPerCell)
    public void addPlantsOnCell() {
        int plantsNumberOnCell = ThreadLocalRandom.current().nextInt(1, new Plants().maxPerCell + 1);
        for (int i = 0; i < plantsNumberOnCell; i++) {
            plantsListOnCell.add(new Plants());
        }
    }

    // Run all methods for every animal
    @Override
    public void run() {
        for (int i = 0; i < animalsListOnCell.size(); i++) {
            animalsListOnCell.get(i).die( i , animalsListOnCell);
            animalsListOnCell.get(i).dailyWorker(animalsListOnCell , i);
            animalsListOnCell.get(i).eat(this);
            animalsListOnCell.get(i).reproduce(animalsListOnCell);
            animalsListOnCell.get(i).moveToOtherCell(animalsListOnCell.get(i).
                    choseDirection(coordinateX ,coordinateY), coordinateX , coordinateY , animalsListOnCell , i);
        }
    }
}
