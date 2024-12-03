package com.javarush.util;
import lombok.Getter;

@Getter
public class Texts {

    // Class with all texts for this app
    private final String AREA_HEIGHT_REQUEST = "Please enter the number bigger than 0 (zero) for the island area height !\n" ;

    private final String AREA_WIDTH_REQUEST = "Please enter the number bigger than 0 (zero) for the island area width !\n";

    private final String WRONG_INTEGER_INPUT = "You entered wrong symbol , zero or negative number !";

    private final String FAILED_INPUT_READING = "Failed InputStream reading from yaml !";

    private final String FAILED_UNPACK = "Failed reading or map unpacking params from yaml !";

    private final String NAME_NOT_FOUND = "This entity name is not found in YAML file with params !";

    private final String INSTANCE_ERROR = "Error creating new instance !";

    private final String CONSTRUCTOR_NOT_FIND = "Failed acces to constructor !";

    private final String ANIMALS_ON_ISLAND = "Animals on island now: ";

}
