package LearningCollections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //"HashSet" is a class implementing "Set" interface

        HashSet myset = new HashSet();


        //duplicates not allowed, multiple not allowed , insertion order is not preserved

        myset.add(15);
        myset.add("Gaurav");
        myset.add(30);

        System.out.println(myset);

        System.out.println(myset.size());

        //print each element of HashSet using foreach loop
        for (Object x : myset) {
            System.out.println(x);
        }

        // for removing elements from HashSet we have to pass value as Index is not supported
        myset.remove(15);

        System.out.println(myset);
    }
}
