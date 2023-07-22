package learningJava;

import java.util.Random;

public class Randomcode {

    public static void main(String[] args) {

        Random random=new Random();

        System.out.println("your random code is  " +random.nextInt(9999));
    }
}
