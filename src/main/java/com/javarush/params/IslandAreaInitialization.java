package com.javarush.params;
import com.javarush.util.Texts;
import java.util.Scanner;

// If you need editable island size add methods from this class to ISLAND_HEIGHT and ISLAND_WIDTH
@Deprecated // Annotations checking \_( -_-)_/
public class IslandAreaInitialization {

    private static Texts text = new Texts();

    // ISLAND_HEIGHT initialization
    public static Integer areaHeightInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(text.getAREA_HEIGHT_REQUEST());
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);

                if (number > 0) {
                    valid = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println(text.getWRONG_INTEGER_INPUT());
            }
        }
        return number;
    }

    // ISLAND_WIDTH initialization
    public static Integer areaWidthInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(text.getAREA_WIDTH_REQUEST());
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);

                if (number > 0) {
                    valid = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println(text.getWRONG_INTEGER_INPUT());
            }
        }
        return number;
    }

}
