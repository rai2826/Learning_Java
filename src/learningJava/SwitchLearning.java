package learningJava;

import java.util.Scanner;

public class SwitchLearning {

    public static void main(String[] args) {

        System.out.println("Enter your age :");

        Scanner sc = new Scanner(System.in);

        int age;

        age = sc.nextInt();


        switch (age) {
            case (60):
                System.out.println("Retired");
                break;
            case (50):
                System.out.println("Enjoy your life");
                break;
            default:
                System.out.println("work hard");


        }
    }
}