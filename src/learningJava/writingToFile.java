package learningJava;

import java.io.*;

public class writingToFile {


    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("I am writing to a file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader reader;

        {
            try {
                reader = new BufferedReader(new FileReader("output.txt"));
                System.out.println(reader.readLine());
                reader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
