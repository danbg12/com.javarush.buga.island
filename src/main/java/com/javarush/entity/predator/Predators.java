package com.javarush.entity.predator;
import com.javarush.entity.Animal;
import com.javarush.island.CellZone;
import java.util.concurrent.ThreadLocalRandom;

public class Predators extends Animal {

    public Predators(String animalName) {
        super(animalName);
    }

    // Method eat for predators . All predators eat only other animals
    // Victim for predator is random and eating probability is also random
    @Override
    public void eat(CellZone cell) {
        if (cell.animalsListOnCell.size() == 0) {
            return;
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(0, cell.animalsListOnCell.size());
        Animal animal = cell.animalsListOnCell.get(randomIndex);
        int eatingTodayProbability = ThreadLocalRandom.current().nextInt(0 , 100);

        if ( this.eatingProbability.get(animal.simpleNameLowerCase) != null ) {
            if (this.eatingProbability.get(animal.simpleNameLowerCase) >= eatingTodayProbability) {
                if (this.actualSatiety + (int)(animal.weight / (this.foodNeededForMaxSatiety / 100 )) >= 100 ) {
                    this.actualSatiety = 100;
                    cell.animalsListOnCell.remove(randomIndex);
                } else {
                    this.actualSatiety += (int)(animal.weight / (this.foodNeededForMaxSatiety / 100 ));
                    cell.animalsListOnCell.remove(randomIndex);
                }
            }
        }
    }
}
