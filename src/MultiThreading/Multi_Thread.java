package MultiThreading;

public class Multi_Thread extends Thread {
    int delay;

    Multi_Thread(int delay) {
        this.delay = delay;
        System.out.println("Thread Name : "+getName());
        System.out.println("Thread Number : "+getId());
        setName("My Thread "+getId());
        System.out.println("Thread Name Changed : "+getName());
        System.out.println("Thread Delay : "+delay+"\n");
    }

    @Override

    public void run() {
        System.out.println("Thread Started : "+getName());
        //System.out.println(i);
        for(int i = 0; i<10000; i++)
            if (i % 1000 == 0) {
                /*
                The following code Puts Sleep Which Causes both the threads to Synchronise.
                */
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("1000 Records Passed in Thread ID" + Thread.currentThread().getId() + " Count: " + i);
            }
    }
}
