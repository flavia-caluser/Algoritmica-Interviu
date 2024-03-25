package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SDA5_Ex1 {
    public static void main(String[] args) {
        List<Map<String,Double>> characteristics = new ArrayList<>();
        Map<String, Double> map1 = new HashMap<>();
        Map<String, Double> map2 = new HashMap<>();
        Map<String, Double> map3 = new HashMap<>();
        Map<String, Double> map4 = new HashMap<>();
        map1.put("temperature", 44.00);
        map1.put("humidity", 12.00);
        map2.put("temperature", 23.00);
        map2.put("humidity", 34.00);
        map3.put("temperature", 34.00);
        map4.put("temperature", null);
        characteristics.add(map1);
        characteristics.add(map2);
        characteristics.add(map3);
        characteristics.add(map4);

        System.out.println(getAverageCharacteristics(characteristics));
    }
    //EROARE LA COLECTARE IN MAPA PENTRU CA GASESTE MAI MULTE CHEI IDENTICE
//    public static Map<String, Double> getAverageCharacteristics1(List<Map<String,Double>> characteristicsList){
//        Map<String,Double> average = new HashMap<>();
//        Map<String,Double> fullMap = new HashMap<>();
//        fullMap =characteristicsList.stream()
//                .flatMap(characteristics->characteristics.entrySet().stream())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        return fullMap;
//    }
    public static Map<String, Double> getAverageCharacteristics(List<Map<String,Double>> characteristicsList){
        Map<String,Double> average = new HashMap<>();
        Map<String, Integer> counter =new HashMap<>();
        for (int i = 0; i < characteristicsList.size(); i++) {
            getCharacteristicsFromEachMap(characteristicsList.get(i), average, counter);
        }
        for(String key: average.keySet()){
            average.put(key, average.get(key)/counter.get(key));
        }
        return average;
    }

    public static void getCharacteristicsFromEachMap(Map<String, Double> map, Map<String, Double> result, Map<String, Integer> counter){
        for(Map.Entry<String, Double> entry: map.entrySet()){
            String key = entry.getKey();
            Double value = entry.getValue();

            if(value != null){
                if(!result.containsKey(key)){
                    result.put(key,value);
                    counter.put(key,1);
                }else{
                    result.put(key, result.get(key)+ value);
                    counter.put(key, counter.get(key)+1 );
                }
            }
        }
    }
}
