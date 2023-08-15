package LearningCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {


        // "ArrayList" is a class implementing "List" interface
        //declaring an array list

        ArrayList arrayList = new ArrayList();

        // It can also be done as below since its implementing list class
        //List arr=new ArrayList();

        //Inserting element to arraylist

        arrayList.add(0, 15);
        arrayList.add(1, 15);
        arrayList.add(2, "Gaurav");
        arrayList.add(3, 15.0);
        arrayList.add(4, 'r');

        //size of the array list
        int size = arrayList.size();
        System.out.println("size of this arraylist is " + size);

        //Printing the elements of the arraylist
        System.out.println("Elements in this arraylist are " + arrayList);

        //Inserting new element in the middle of the list,this will increase the size of the arraylist and shift all elements to right
        arrayList.add(2, 100);
        System.out.println("Elements in this arraylist are " + arrayList);
        int size1 = arrayList.size();
        System.out.println("size of this arraylist after inserting new element is " + size1);

        // Getting specific value from arraylist
        System.out.println("value at index 3 is " + arrayList.get(3));

        //Read all data from arraylist using foreach loop, since arraylist contains heterogeneous data we need to use object data type

        for (Object x:arrayList) {
            System.out.println(x);

        }

        System.out.println("==============================================================================");
        ArrayList<String> SArrList=new ArrayList<>();

        SArrList.add("Gaurav");
        SArrList.add("Rai");

        System.out.println(SArrList.size());

        // Print each element of ArrayList using Lambda Stream

        SArrList.stream().forEach(EleOfAList -> System.out.println(EleOfAList));

        System.out.println(SArrList.contains("gaurav"));
    }
}
