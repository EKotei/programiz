package ifstate;

public class Ladder {
    public static void main(String[] args) {
        String color = "red";

        if (color == "red") {
            System.out.println("Stop!");
        } else if (color == "yellow") {
            System.out.println("Get ready to Stop!");
        }

    else if (color == "green") {
        System.out.println("Gooooo mf gooo!");
    }

    else {
            System.out.println("You shouldn't be on the road if you don't know this!");
        }
}

}
