package com.javarush.island;
import lombok.Getter;

public class Island {

    // Default Island size
    private static final Integer ISLAND_HEIGHT = 100;
    private static final Integer ISLAND_WIDTH = 20;
    @Getter
    public static CellZone[][] arrayWithAllCells = new CellZone[ISLAND_HEIGHT][ISLAND_WIDTH];  // Island area array

    // Method fill Island area in arrayWithAllCells with different instances of Cell
    static void fillArrayWithCells() {
        for (int i = 0; i < arrayWithAllCells.length; i++) {
            for (int j = 0; j < arrayWithAllCells[i].length; j++) {
                arrayWithAllCells[i][j] = new CellZone(i , j);
            }
        }
    }

    public static Integer getISLAND_HEIGHT() { return ISLAND_HEIGHT;}

    public static Integer getISLAND_WIDTH() { return ISLAND_WIDTH;}
}
