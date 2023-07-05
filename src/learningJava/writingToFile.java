package learningJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingToFile {

    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("I am writing to a file");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
