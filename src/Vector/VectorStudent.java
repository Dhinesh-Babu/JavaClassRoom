package Vector;

import java.util.Iterator;
import java.util.Vector;

class student {
    int id;
    String name;
    int mark;
    student(int id,String name,int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    public void showa() {
        System.out.println("Record : "+name+"\t"+id+"\t"+mark);
    }
}

class VectorStudent {
    public static void main(String[] args) {
        Vector<student> vector = new Vector<student>();

        for(int i = 0; i<5; i++) {
            student in = new student(i, String.format("Dhinesh%d", i),33+i);
            vector.add(in);
        }
        Iterator<student> i = vector.iterator();
        System.out.println("All Records");
        while( i.hasNext() ) {
            i.next().showa();
        }
        i = vector.iterator();
        student temp;
        while( i.hasNext() ) {
            temp = i.next();
            if(temp.mark <= 35)
                i.remove();
        }
        i = vector.iterator();
        System.out.println("\n\nAll Records after removal");
        while( i.hasNext() ) {
            i.next().showa();
        }
    }
}
