package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SDA5_Ex1 {
    public static void main(String[] args) {
        List<Map<String,Double>> characteristics = List.of(
                Map.of("temperature", 44.00, "humidity", 12.00),
                Map.of("temperature", 23.00, "humidity", 34.00),
                Map.of("temperature", 34.00),
                Map.of("temperature", null));

    }
//MAI TREBUIE SA FAC MEDIA PENTRU FIECARE CHEIE SI AM DOAR SUMELE
    public static Map<String, Double> getAverageCharacteristics(List<Map<String,Double>> characteristicsList){
        Map<String,Double> average = new HashMap<>();
        for (int i = 0; i < characteristicsList.size(); i++) {
            getCharacteristicsFromEachMap(characteristicsList.get(i), average);
        }
        return average;
    }

    public static void getCharacteristicsFromEachMap(Map<String, Double> map, Map<String, Double> result){
        for(Map.Entry<String, Double> entry: map.entrySet()){
            String key = entry.getKey();
            Double value = entry.getValue();
            if(value != null){
                if(!result.containsKey(key)){
                    result.put(key,value);
                }else{
                    result.put(key, result.get(key)+ value);
                }
            }
        }
    }
}
