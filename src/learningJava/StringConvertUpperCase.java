package learningJava;

import java.util.Scanner;

public class StringConvertUpperCase {

    public static void main(String[] args) {

        Scanner s1= new Scanner(System.in);
        Scanner s2= new Scanner(System.in);

        System.out.println(" please enter your first name");

        String str1= new String(s1.next());

        String str2 = str1.toUpperCase();

        System.out.println(str2);

        System.out.println(" Please enter your full name");

        String str3;
        str3 = s2.nextLine();

        String str4 = str3.toUpperCase();

        System.out.println(str4);


    }


}
