package com.test;


import java.util.*;
import java.util.stream.Collectors;


public class AverageTime {

    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "getUser:1200",
                "createUser:2500",
                "getUser:1800",
                "deleteUser:3000",
                "createUser:2200"
        );


        Map<String, Double> averageTimes = calculateAverageTimes(logs);
        System.out.println("averageResponseTime (second aproach) : "+averageTimes);

        List<String> apisAboveThreshold = findApisAboveThreshold(averageTimes, 2000);
        System.out.println("API with threshold avobe 2000 are : "+ apisAboveThreshold);
    }

    public static Map<String, Double> calculateAverageTimes(List<String> logs) {
        Map<String, Long> totalTimes = new HashMap<>();
        Map<String, Long> callCounts = new HashMap<>();

        for (String log : logs) {
            String[] parts = log.split(":");
            String apiName = parts[0];
            long time = Long.parseLong(parts[1]);

            totalTimes.put(apiName, totalTimes.getOrDefault(apiName, 0L) + time);
            callCounts.put(apiName, callCounts.getOrDefault(apiName, 0L) + 1);
        }

        Map<String, Double> averageTimes = new HashMap<>();
        for (String apiName : totalTimes.keySet()) {
            double average = (double) totalTimes.get(apiName) / callCounts.get(apiName);
            averageTimes.put(apiName, average);
        }

        return averageTimes;
    }

    /**
     * Finds the list of APIs whose average time is greater than a given threshold.
     * @param averageTimes A map of API names to their average times.
     * @param threshold The time threshold in milliseconds.
     * @return A list of API names that exceed the threshold.
     */
    public static List<String> findApisAboveThreshold(Map<String, Double> averageTimes, double threshold) {
        return averageTimes.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
