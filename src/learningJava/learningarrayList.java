package learningJava;

import java.util.ArrayList;
import java.util.Collections;

public class learningarrayList {
    public static void main(String[] args) {

        ArrayList list= new ArrayList();

        list.add("Manu");
        list.add(100);
        list.add("Gaurav");

        System.out.println(list);

        int size=list.size();

        System.out.println(size);

        list.add(0,"hello");

        System.out.println(list);

       // Collections.sort(list);

        System.out.println(list);

    }
}
