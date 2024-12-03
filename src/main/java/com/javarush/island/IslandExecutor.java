package com.javarush.island;
import com.javarush.util.Texts;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class IslandExecutor extends Thread {

    private static Texts text = new Texts();
    private static final int POOL_SIZE = 5;
    private static final int SCHEDULED_POOL_SIZE = 1;
    private static final int SIMULATION_DAYS = 100;

    // Method execute for all animals methods from class Animal
    // Scheduled executor is used to print statistics for every day from 100 and add more plants in all zones / cells
    public void runIsland() {
        Island.fillArrayWithCells();
        CellZone[][] arrayWithAllCells = Island.arrayWithAllCells;

        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(SCHEDULED_POOL_SIZE);

        // Animals statistics
        for (int day = 1; day <= SIMULATION_DAYS; day++) {
            AtomicInteger integer = new AtomicInteger(day);
            Map<String, Integer> entitylStatistics = new HashMap<>();
            // Animals statistic
            for (int i = 0; i < arrayWithAllCells.length; i++) {
                for (int j = 0; j < arrayWithAllCells[i].length; j++) {
                    for (Animal animal : arrayWithAllCells[i][j].getAnimalsListOnCell()) {
                        String animalClassName = animal.emoji + " " + animal.getClass().getSimpleName().toLowerCase() + " ";
                        if (entitylStatistics.containsKey(animalClassName)) {
                            entitylStatistics.put(animalClassName, entitylStatistics.get(animalClassName) + 1);
                        } else {
                            entitylStatistics.put(animalClassName, 1);
                        }
                    }

                }
            }

            //Plants statistics
            for (int i = 0; i < arrayWithAllCells.length; i++) {
                for (int j = 0; j < arrayWithAllCells[i].length; j++) {
                    for (Plants plant : arrayWithAllCells[i][j].plantsListOnCell) {
                        String plantsCount = plant.emoji + " " + plant.getClass().getSimpleName().toLowerCase() + " ";
                        if (entitylStatistics.containsKey(plantsCount)) {
                            entitylStatistics.put(plantsCount, entitylStatistics.get(plantsCount) + 1);
                        } else {
                            entitylStatistics.put(plantsCount, 1);
                        }
                    }

                }
            }

            // Final printed statistic
            String result = entitylStatistics.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue())
                    .collect(Collectors.joining(", "));

            Runnable task = () -> {
                System.out.println("DAY " + integer);
                System.out.println(text.getANIMALS_ON_ISLAND() + result);
                for (int i = 0; i < arrayWithAllCells.length; i++) {
                    for (int j = 0; j < arrayWithAllCells[i].length; j++) {
                        arrayWithAllCells[i][j].addPlantsOnCell();
                    }
                }
            };

            scheduledExecutor.scheduleAtFixedRate(task , 0 , 100, TimeUnit.SECONDS);

            for (int i = 0; i < arrayWithAllCells.length; i++) {
                for (int j = 0; j < arrayWithAllCells[i].length; j++) {
                    executor.submit(arrayWithAllCells[i][j]);
                }

            }
        }
        scheduledExecutor.shutdown();
        executor.shutdown();
    }
}