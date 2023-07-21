package learningJava;

public class ForEachLoop {

    public static void main(String[] args) {

        // for each loop helps in traversing the array

        int[] num= new int[]{1, 2, 3, 4, 9, 6};

        for (int i : num) {


            if (i%2==0)
                System.out.println(num[i-1] + "is even");
            else
                System.out.println(num[i-1] + "is odd");
        }


    }
}
