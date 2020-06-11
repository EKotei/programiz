package write;

import java.io.FileWriter;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        String data = "This is the jawn that should output";

        try {
            // Creates a Writer using FileWriter
            Writer output = new FileWriter("output.txt");


            // Writes string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
