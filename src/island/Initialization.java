package island;

import island.settings.Text;

import java.util.Scanner;

public class Initialization {

    private static Text text = new Text();

    // ISLAND_HEIGHT initialization
    static Integer areaHeightInput() {
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
    static Integer areaWidthInput() {
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
