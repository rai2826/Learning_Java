package learningJava;

import java.util.Scanner;
import java.util.stream.Stream;

public class Elseif {

    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 60)
            System.out.println("You are an old man");
        else if (age > 35) {

            System.out.println("you are a middle aged man");


        } else
            System.out.println("you are a young man");


    }

}
