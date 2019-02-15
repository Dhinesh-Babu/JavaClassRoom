class Multi extends Thread {
    public void run() {
        System.out.println("Start Of Thread"+getId()+" Calls the Run() Function");
        for(int i = 0; i<10000; i++) {
            //System.out.println(i);
            if( i%1000 == 0 ){
                /*
                The following code Puts Sleep Which Causes both the threads to Synchronise.
                */

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("1000 Records Passed in Thread ID"+getId()+" Count: "+i);
            }
        }
    }
}

class Driver {
    public static void  main(String[] args) {
        Multi t1 = new Multi();
        Multi t2 = new Multi();
        //Only when using Start will it start a thread.
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
        The following runs program sequentially
        t1.run();
        t2.run();
         */
    }
}