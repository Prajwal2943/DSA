package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(1);

        System.out.println("Original list : " + list);

        Collections.sort(list); //ascending order
        System.out.println("List sorted in Ascending order: " + list);

        //descending order
        Collections.sort(list,Collections.reverseOrder()); //reverseOrder() is the comparator in java that defines the logic of the sorting
        System.out.println("List sorted in Descending order: " + list);
    }
}