package LearningCollections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Hashmap class implements Map interface
        // Used to store the key value pair

        HashMap HMap=new HashMap();


        // It can also be declared as below
        // Map HMap=new HashMap();

        HMap.put("Age",30);
        HMap.put("Name","Shalini");

        System.out.println(HMap.size());
        System.out.println(HMap);
        //keySet method provides the list of keys and then we can use the for each loop to get the values of the key
        for (Object x:HMap.keySet()) {
            System.out.println(x +"    " +HMap.get(x));
        }

    }
}
