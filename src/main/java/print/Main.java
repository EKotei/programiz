package print;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        String data = "My name is... What? My name is Slim Shady";

        try {
            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
