package Synchronization;

public class Account {
    private int amount = 500;

    synchronized void withdraw(int amount) {
        System.out.println("\nGoing to Withdraw : "+amount+"\t\t"+Thread.currentThread().getName());

        if(this.amount < amount) {
            System.out.println("No Balance, Waiting for Deposit for transaction : " + amount+"\t"+Thread.currentThread().getName());
            try {
                /* The Thread is put in a wait state. It waits for a Notify() command to occur to remove it from a wait
                state. One Notify() will unflag only one Wait()
                 */
                wait();
            } catch (Exception e) {
                System.out.println("Error in" +Thread.currentThread().getName());
            }
        }

        this.amount -= amount;
        System.out.println("\nTransaction Done Amount : " + amount+"\t"+Thread.currentThread().getName());

        System.out.println("\t\tAmount in Account : "+this.amount+"\t"+Thread.currentThread().getName());
    }

    synchronized void deposit(int amount) {
        System.out.println("\nDeposit Transaction Begin : "+amount+"\t"+Thread.currentThread().getName());
        this.amount +=amount;
        System.out.println("\nDeposited : "+amount+"\t"+Thread.currentThread().getName());
        System.out.println("\t\tAmount in Account : "+this.amount+"\t"+Thread.currentThread().getName());
        notifyAll();
    }
}

