package com.coder.security.config;

import java.util.*;

class Main {
   /* public static void main(String[] args) {
        String[] input = {"1:[5]", "4:[5]", "3:[5]", "5:[1,4,3,2]", "2:[5,15,7]", "7:[2,8]", "8:[7,38]", "15:[2]", "38:[8]"};
       // String result = GraphChallenge(input);
       // System.out.println(result);
    }

    public static String GraphChallenge(String[] strArr) {
        Map<Integer, Integer> cityPopulations = new HashMap<>();
        Map<Integer, List<Integer>> cityConnections = new HashMap<>();

        // Parse the input and build cityPopulations and cityConnections maps
        for (String str : strArr) {
            String[] parts = str.split(":");
            int city = Integer.parseInt(parts[0]);
            int population = Integer.parseInt(parts[1].substring(1, parts[1].length() - 1));
            cityPopulations.put(city, population);

            if (parts.length > 2) {
                String[] neighbors = parts[2].split(",");
                List<Integer> neighborList = new ArrayList<>();
                for (String neighbor : neighbors) {
                    neighborList.add(Integer.parseInt(neighbor));
                }
                cityConnections.put(city, neighborList);
            }
        }

        Map<Integer, Integer> maxTraffic = new HashMap<>();

        // Calculate max traffic for each city
        for (int city : cityPopulations.keySet()) {
            Set<Integer> visited = new HashSet<>();
            int traffic = calculateTraffic(city, city, cityPopulations, cityConnections, visited);
            maxTraffic.put(city, traffic);
        }

        // Convert maxTraffic map to a sorted string
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(maxTraffic.entrySet());
        sortedEntries.sort(Map.Entry.comparingByKey());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            result.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }

        // Remove the trailing comma and return the result
        return result.substring(0, result.length() - 1);
    }

    private static int calculateTraffic(int startCity, int currentCity, Map<Integer, Integer> cityPopulations,
                                        Map<Integer, List<Integer>> cityConnections, Set<Integer> visited) {
        visited.add(currentCity);
        int traffic = cityPopulations.get(currentCity);

        if (cityConnections.containsKey(currentCity)) {
            for (int neighbor : cityConnections.get(currentCity)) {
                if (!visited.contains(neighbor) && neighbor != startCity) {
                    traffic += calculateTraffic(startCity, neighbor, cityPopulations, cityConnections, visited);
                }
            }
        }

        return traffic;
    }

    */
}
