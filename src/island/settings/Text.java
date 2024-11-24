package island.settings;

public class Text {

   private final String AREA_HEIGHT_REQUEST = "Please enter the number bigger than 0 (zero) for the island area height !\n" ;

   private final String AREA_WIDTH_REQUEST = "Please enter the number bigger than 0 (zero) for the island area width !\n";

   private final String WRONG_INTEGER_INPUT = "You entered wrong symbol , zero or negative number !";

   public String getAREA_HEIGHT_REQUEST() { return AREA_HEIGHT_REQUEST;}

   public String getWRONG_INTEGER_INPUT() { return WRONG_INTEGER_INPUT;}

   public String getAREA_WIDTH_REQUEST() { return AREA_WIDTH_REQUEST;}
}
