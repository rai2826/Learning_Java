package learningJava;

import java.util.Scanner;

public class TakingInputFromKeyboardInteger {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");

        Scanner S = new Scanner(System.in);

        System.out.println("Enter first number");
        int a= S.nextInt();

        System.out.println("Enter second number");
        int b= S.nextInt();

        int c= a+b;

        System.out.println("sum of both number is " + c);

    }
}
