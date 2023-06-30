package learningJava;

import java.util.Arrays;

public class learningArrays {

    public static void main(String[] args) {

        int[] a;
        a = new int[]{5,2,1,4,3};
        System.out.println("item at first place is " +a[0]);
        System.out.println("length of this array is " +a.length);
       //System.out.println("before sorting " +a[0]);

        for(int i=0;i<a.length;i++){
            System.out.println("before sorting "+a[i]);
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.println("After sorting " + a[i]);
            //System.out.println("after sorting first place is " +a[0]);
        }
        String[] name ={"Gaurav","Shalini","Siya"};
        System.out.println("name at first place is "  + name[0]);
    }
}
