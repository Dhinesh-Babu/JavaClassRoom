package Synchronization;

public class Driver {
    public static void main(String[] args) {
        Account acc = new Account();

        //Creating Thread Object to Overwrite the Function
        Thread t1 = new Thread("Thread - 1")
        {
            //Overwriting the existing run function of Thread. run() is called on t1.start.
            public void run() {
                acc.withdraw(15000);
            }
        };

        Thread t2 = new Thread("Thread - 2")
        {
            public void run() {
                acc.deposit(10000);
            }
        };

        Thread t3 = new Thread("Thread - 3")
        {
            public void run() {
                acc.withdraw(5000);
            }
        };

        t1.start();
        t2.start();
        t3.start();


    }
}
