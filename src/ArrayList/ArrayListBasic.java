package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for (Integer i : arrayList) {
            System.out.println(i);
        }
        Iterator<Integer> i = arrayList.iterator();
        while ( i.hasNext() ) {
            System.out.println(i.next().intValue());
            //i.next();
        }
    }
}
