package marvellist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> marvel = new ArrayList<>();
        // Add elements
        marvel.add("Black Panther");
        marvel.add("Wolverine");
        marvel.add("Human Torch");
        marvel.add("Iron Man");
        marvel.add("Cable");
        marvel.add("Deadpool");
        System.out.println(marvel.remove(5));
        System.out.println(marvel.contains("Deadpool"));
        System.out.println("ArrayList: " + marvel);


    }
}


