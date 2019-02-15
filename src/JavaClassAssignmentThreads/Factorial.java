package JavaClassAssignmentThreads;

public class Factorial extends Thread {
    private int number;
    int Fact = 1;
    Factorial(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Thread Started: "+getId());
        for(int i=1; i<=number; i++)
            Fact *= i;

    }
}
