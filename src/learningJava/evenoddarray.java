package learningJava;

import javax.swing.*;

public class evenoddarray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int even[] = new int[9];
        int odd[] = new int[9];
        int len = a.length;

        for (int i = 0; i < len; i++) {

            if
            (a[i] % 2 == 0) {  //System.out.println(a[i] + "is an even number");
                even[i] = a[i];
                System.out.println("even numbers are" +even[i]);
            }
            else
                odd[i]=a[i];
            System.out.println("odd numbers are" +odd[i]);

        }

      /*  for (int evennum:even)

        {
            System.out.println("even numbers are " + even);

        }

        for (int oddnum:odd)
              {
                  System.out.println("odd nums are" +odd);

        }*/

    }

    }

