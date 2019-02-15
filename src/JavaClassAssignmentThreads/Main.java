package JavaClassAssignmentThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Factorial F = new Factorial(5);
        SquareRoot S = new SquareRoot(25);
        SumOfPrime P = new SumOfPrime(5);
        S.start();
        F.start();
        P.start();
        S.join();
        F.join();
        P.join();
        System.out.println("Result : "+(S.sqrt+P.sum+F.Fact));
        System.out.println("Sum of Prime : "+P.sum);
        System.out.println("Square Root : "+S.sqrt);
        System.out.println("Factorial : "+F.Fact);
    }
}
