package JavaClassAssignmentThreads;

import static java.lang.Math.*;

public class SquareRoot extends Thread {
    int number;
    double sqrt;
    SquareRoot(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Thread Started: "+getId());
        sqrt = sqrt(number);
    }
}
