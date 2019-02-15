package JavaClassAssignmentThreads;

public class SumOfPrime extends Thread{
    private int number;
    int sum = 0;
    SumOfPrime(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Thread Started: "+getId());
        for(int i=2;i<=number;i++) {
            if(prime(i)) {
                sum += i;
                //System.out.println(i);
            }
        }
    }

    private boolean prime(int num) {
        for(int i=2;i<=num/2;i++)
            if(num%i == 0)
                return false;
        return true;
    }
}
