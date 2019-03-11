package Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorBasic {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Hello");
        vector.add("Dhinesh");
        vector.add("Babu");
        vector.add("Here");

        Iterator<String> i = vector.iterator();

        while( i.hasNext() ) {
            System.out.println(i.next());
        }
    }
}
