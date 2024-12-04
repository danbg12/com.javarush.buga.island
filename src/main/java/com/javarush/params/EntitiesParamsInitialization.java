package com.javarush.params;
import com.javarush.util.Texts;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class EntitiesParamsInitialization {

    private static Texts text = new Texts();

    // Fill this Map with params from yaml with animal name key and AnimalParams value
    private static final Map<String, AnimalParams> mapWithParams = new HashMap<>();

    static {
        // Read bytes from yaml with inputStream
        try (InputStream inputStream = EntitiesParamsInitialization.class.
                getClassLoader().
                getResourceAsStream("Params_all_entities.yaml")) {

            if (inputStream == null) {
                System.out.println(text.getFAILED_INPUT_READING());
                throw new RuntimeException();
            }

            Yaml yaml = new Yaml();
            Map<String, Map<String, Object>> yamlData = yaml.load(inputStream);

            // Unpack data from yaml
            for (Map.Entry<String, Map<String, Object>> stringMapEntry : yamlData.entrySet()) {
                String entityName = stringMapEntry.getKey();

                // For all animal names this map contains personal params
                Map<String, Object> values = stringMapEntry.getValue();
                AnimalParams params = new AnimalParams();

                // Get params for all personal variables
                params.setEmoji((String) values.get("emoji"));
                params.setSimpleNameLowerCase((String) values.get("simple_name_to_lower_case"));
                params.setWeight((Double) values.get("weight"));
                params.setMaxPerCell((Integer) values.get("max_per_cell"));
                params.setMaxSpeed((Integer) values.get("max_speed"));
                params.setFoodNeededForMaxSatiety((Double) values.get("food_needed_for_max_satiety"));
                params.setEatingProbability((Map<String, Integer>) values.get("eating_probability"));

                mapWithParams.put(entityName.toLowerCase(), params);
            }
        } catch (Exception e) {
            System.out.println(text.getFAILED_UNPACK());
            throw new RuntimeException(e);
        }

    }

    public static AnimalParams getParams( String animalName) {
        return mapWithParams.get(animalName.toLowerCase());
    }
}
