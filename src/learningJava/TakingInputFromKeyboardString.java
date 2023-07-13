package learningJava;

import java.util.Scanner;

public class TakingInputFromKeyboardString {

    public static void main(String[] args) {

        System.out.println("Hello Welcome to Java Learning today");


        // Use the Scanner class to take input
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter your First name ");

        String S1= sc.next();

        System.out.println("Please enter your Last name ");

        String S2= sc.next();

        System.out.println(" Good Morning  " + S1 +" " + S2);

    }
}
