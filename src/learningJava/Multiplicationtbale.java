package learningJava;

public class Multiplicationtbale {

    public static void main(String[] args) {

        Multiplicationtbale.multiply(19);

    }

    public static void multiply(int x){

        for (int i=1; i<=10;i++){

           int  y=x*i;
            System.out.println(y);
        }

    }
}
