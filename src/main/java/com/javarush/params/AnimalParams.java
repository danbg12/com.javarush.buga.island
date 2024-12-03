package com.javarush.params;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
public class AnimalParams {
    public String emoji;
    public String simpleNameLowerCase;
    public double weight;
    public int maxPerCell;
    public int maxSpeed;
    public double foodNeededForMaxSatiety;
    public Map<String , Integer> eatingProbability;
}
