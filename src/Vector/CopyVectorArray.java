package Vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
public class CopyVectorArray {
    public static void main(String[] args) {
        //Creating Vector
        Vector<String> vector = new Vector<String>();
        vector.add("Hello");
        vector.add("Dhinesh");
        vector.add("Babu");
        vector.add("Here");
        Iterator<String> i = vector.iterator();
        System.out.println("Contents of Vector");
        while( i.hasNext() ) {
            System.out.println(i.next());
        }
        i=vector.iterator();
        //Copying to ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        while( i.hasNext() ){
            arrayList.add(i.next());
        }
        System.out.println("\nArrayList Contents");
        i=arrayList.iterator();
        while( i.hasNext() ){
            System.out.println(i.next());
        }
    }
}
