package island;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Island {

    private static final Integer ISLAND_HEIGHT = Initialization.areaHeightInput();
    private static final Integer ISLAND_WIDTH = Initialization.areaWidthInput();
    private static ArrayList<Object>[][] array = new ArrayList[ISLAND_HEIGHT][ISLAND_WIDTH];

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Cell().generateCell();
            }
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j].size());
                System.out.println(i);
            }
        }

    }
}
