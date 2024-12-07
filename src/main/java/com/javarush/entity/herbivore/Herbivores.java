package com.javarush.entity.herbivore;
import com.javarush.entity.Animal;
import com.javarush.island.CellZone;
import com.javarush.entity.Plants;
import java.util.concurrent.ThreadLocalRandom;

public class Herbivores extends Animal {

    public Herbivores(String animalName) {
        super(animalName);
    }


    // Method ead for herbivores . Some herbivore are half predators and ea few kind of animals
    // If the animal is half predator this method try to feed firstly with other animal
    // If first try to eat other random animal is failed this animal eat plants .
    @Override
    public void eat(CellZone cell) {

        if (cell.animalsListOnCell.size() == 0 || cell.plantsListOnCell.size() == 0) { return;}

        int randomIndexForAnimals = ThreadLocalRandom.current().nextInt(0, cell.animalsListOnCell.size());
        int randomIndexForPlants = ThreadLocalRandom.current().nextInt(0, cell.plantsListOnCell.size());
        Animal animal = cell.animalsListOnCell.get(randomIndexForAnimals);
        Plants plant = cell.plantsListOnCell.get(randomIndexForPlants);

        if (this.getClass().equals(Duck.class)
                || this.getClass().equals(Boar.class)
                || this.getClass().equals(Mouse.class)) {
            // Try to eat other animals
            int eatingTodayProbability = ThreadLocalRandom.current().nextInt(0 , 100);
            if ( this.eatingProbability.get(animal.simpleNameLowerCase) != null ) {
                if (this.eatingProbability.get(animal.simpleNameLowerCase) >= eatingTodayProbability) {
                    if (this.actualSatiety + (int)(animal.weight / (this.foodNeededForMaxSatiety / 100 )) >= 100 ) {
                        this.actualSatiety = 100;
                        cell.animalsListOnCell.remove(randomIndexForAnimals);
                    } else {
                        this.actualSatiety += (int)(animal.weight / (this.foodNeededForMaxSatiety / 100 ));
                        cell.animalsListOnCell.remove(randomIndexForAnimals);
                    }
                }
                // After falling eat plants
            } else if (cell.plantsListOnCell.size() > 0) {
                if (this.actualSatiety + (int)(plant.weight / (this.foodNeededForMaxSatiety / 100 )) >= 100 ) {
                    this.actualSatiety = 100;
                    cell.plantsListOnCell.remove(randomIndexForPlants);
                } else {
                    this.actualSatiety += (int)(plant.weight / (this.foodNeededForMaxSatiety / 100 ));
                    cell.plantsListOnCell.remove(randomIndexForPlants);
                }
            }
            // If this animal int t half predator , eat plants
        } else if (cell.plantsListOnCell.size() > 0) {
            if (this.actualSatiety + (int)((plant.weight / (this.foodNeededForMaxSatiety / 100 ))) >= 100 ) {
                this.actualSatiety = 100;
                cell.plantsListOnCell.remove(randomIndexForPlants);
            } else {
                this.actualSatiety += (int)((plant.weight / (this.foodNeededForMaxSatiety / 100 )) / 4);
                cell.plantsListOnCell.remove(randomIndexForPlants);
            }
        }
    }
}
