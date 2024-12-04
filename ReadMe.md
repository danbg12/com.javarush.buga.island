ISLAND PROJECT

Class hierarchy
- Animal
    - Herbivore
        - 🐎 Horse 
        - 🦌 Deer 
        - 🐇 Rabbit 
        - 🐁 Mouse
        - 🐐 Goat
        - 🐑 Sheep
        - 🐗 Boar
        - 🐃 Buffalo
        - 🦆 Duck
        - 🐛 Caterpillar
    - Predator
        - 🐺 Wolf
        - 🐍 Boa
        - 🦊 Fox
        - 🐻 Bear
        - 🦅 Eagle
- Plants
- Each animal on the island has the following characteristics :
- emoji - emoji representing the animal (for statistics).
- simpleNameLowerCase - animal type at lower case.
- weight - animals weight (used in eat() method ).
- maxPerCell - maximal count of this type animals in one cell.
- maxSpeed - the maximum distance the animal can move ( in cells).
- foodNeededForMaxSatiety - how much kilo of food need this animal for maximal satiety.
- actualSatiety - actual satiety for every animal .
- eatingProbability - map with eating probability coefficients for all animals.

All these fields are stored in yaml file "Params_all_entities.yaml" . All the value for each 
individual animal are taken from the yaml in class EntitiesParamsInitialization . After all values are
taken from yaml all entities are initialized Animal.class constructor .

Each animal on the island has possibilities that are described in the following methods:
- eat() - the animal eats . For Herbivor and Predators different different achievements.
- reproduce() - if random chosen animal from collection is the same type like this , they create another animal.
- choseDirection() - return random direction from Enum Directions.
- moveToOtherCell() - use returned direction from choseDirection() and move the animal to this cell if it
is possible .
- dailyWorker() - at each iteration it decreases actualSatiety for every animal.
- die() - remove animal from cell collection animalsListOnCell if actualSatiety field is under 0.

Class RunApp run the program.

Class CellZone represents a zone from the array CellZone[][] arrayWithAllCells. In each CellZone there is the animalsListOnCell collection that stores the animals in this zone and the plantsListOnCell collection that stores all the plants in this zone. The number of slopes and of all animals is a random one that is calculated using the ThreadLocalRandom class.

Class Island contains the size of the island: ISLAND_HEIGHT and ISLAND_WIDTH. Likewise, the array CellZone[][] arrayWithAllCells is filled with different CellZone instances

Class IslandExecutor is responsible for executing the program using ExecutorService of type Executors.newFixedThreadPool and Executors.newScheduledThreadPool. Likewise, in this class, the collection and presentation of statistics about the condition of the animals on the island is carried out at each iteration. 

Class Animal is an abstract class that contained the realization of all methods for animals and the constructor that initializes the fields of each entity.

