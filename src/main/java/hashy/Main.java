package hashy;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedHashMap of ball players and jersey numbers
        LinkedHashMap<String, Integer> ballPlayers = new LinkedHashMap<>();
        ballPlayers.put("Lebron", 23);
        ballPlayers.put("Kobe", 24);
        System.out.println("LinkedHashMap1: " + ballPlayers);

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> ballPlayers2 = new LinkedHashMap<>(ballPlayers);
        ballPlayers2.put("Giannis", 34);
        System.out.println("LinkedHashMap2: " + ballPlayers2);
    }

}

