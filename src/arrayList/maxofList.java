package arrayList;

import java.util.ArrayList;

public class maxofList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(1);

        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <list.size(); i++) {
            if(max<list.get(i)){
                max= list.get(i);
            }
//            max=Math.max(max,list.get(i));
        }
        System.out.println("Max value : " + max);


    }
}
