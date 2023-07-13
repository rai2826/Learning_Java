package learningJava;

import java.util.Scanner;

public class CbseMarksPercentageQuestion {

    // Take input from users to store marks in 5 subjects , marks should be out of 100 and return the percentage


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Hindi marks");

        int h= sc.nextInt();
       // boolean b1 = sc.hasNextInt();
        /* if (b1)
             System.out.println("Enter your English marks");
                int E=sc.nextInt();

         else
             System.out.println("wrong number");

            */

        System.out.println("Enter your English marks");
        int e= sc.nextInt();

        System.out.println("Enter your Maths marks");
        int m= sc.nextInt();

        System.out.println("Enter your Science marks");
        int s=sc.nextInt();

        System.out.println("Enter your History marks");
        int hi=sc.nextInt();

        float per= ((h+e+m+s+hi))/5;

        System.out.println(" your Percentage " + " " + per);
    }
}
