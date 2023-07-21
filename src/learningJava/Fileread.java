package learningJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {

    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("C:\\Users\\d629263\\Downloads\\filereader.txt");

        Scanner sc=new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
