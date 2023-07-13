package learningJava;

public class Multiplicationtbale {

    public static void main(String[] args) {

        Multiplicationtbale M= new Multiplicationtbale();

        M.multiply(19);

    }

    public int multiply(int x){
           int y = 0;
        for (int i=1; i<=10;i++){

            y=x*i;

             System.out.println(y);
        }
     return y;
    }
}
